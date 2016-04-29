import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
   This class builds an index for a document that is 
   organized into segments (such as pages or chapters). 
*/
public class Index
{
   private Map<String, TreeSet<Integer>> segmentsForWords;
   private int segment;

   /**
      Constructs an empty index.
   */
   public Index()
   {
      segmentsForWords = new TreeMap<String, TreeSet<Integer>>();
      segment = 0;
   }     

   /**
      Adds a word to the current segment.
      @param word the word to add
   */
   public void addWord(String word)
   {
      TreeSet<Integer> segments = segmentsForWords.get(word);
      if (segments == null) 
      {
         segments = new TreeSet<Integer>();
         segmentsForWords.put(word, segments);
      }
      segments.add(segment);
   }

   /**
      Advances to the next segment.
   */
   public void nextSegment()
   {
      segment++;
   }

   /**
      Gets all words that have been added.
      @return a sorted set of all words
   */
   public Set<String> getWords()
   {
      return segmentsForWords.keySet();
   }

   /**
      Gets the segments in which the given word occurs
      @param word a word
      @return a sorted set of all segments in which the word occurs
   */
   public Set<Integer> getSegments(String word)
   {
      Set<Integer> segments = segmentsForWords.get(word);
      if (segments == null) 
      {
         return new TreeSet<Integer>();
      }
      else
         return segments;
   }
}
