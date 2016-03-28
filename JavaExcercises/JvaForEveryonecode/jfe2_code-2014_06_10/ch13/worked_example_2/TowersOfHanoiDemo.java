import java.util.ArrayList;
import java.util.Arrays;

/**
   This program shows a solution for a Towers of Hanoi puzzle.
*/
public class TowersOfHanoiDemo
{
   public static void main(String[] args)
   {
      final int NTOWERS = 5;
      TowersOfHanoi towers = new TowersOfHanoi(NTOWERS);
      towers.move(NTOWERS, 0, 2);
   }
}
