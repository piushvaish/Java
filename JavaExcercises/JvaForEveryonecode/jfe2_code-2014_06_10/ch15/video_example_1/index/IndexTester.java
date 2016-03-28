import java.io.IOException;
import java.io.File;
import java.util.Scanner;

/**
   This program displays a table of contents of the book 
   "Alice in Wonderland"
*/
public class IndexTester
{
   public static void main(String[] args) 
   {
      try
      {
         Index idx = new Index();
         Scanner in = new Scanner(new File("alice30.txt"));
         in.useDelimiter("[^A-Za-z]+");
         while (in.hasNext())
         {
            String word = in.next();
            if (word.equals("CHAPTER"))
            {
               // Start a new segment for each chapter
               idx.nextSegment(); 
            }
            else
            {
               idx.addWord(word.toLowerCase());
            }
         }

         // Print the table of contents
         for (String word : idx.getWords())
         {
            System.out.println(word + " " + idx.getSegments(word));
         }
      }
      catch (IOException ex)
      {
         ex.printStackTrace();
      }
   }
}
