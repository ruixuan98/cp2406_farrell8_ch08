// Sum and average an array of integers
public class DebugEight2
{
   public static void main(String args[])
   {
      int[] someNums = {4, 17, 22, 8, 35};
      int tot = 0, i;
      double avg;
      for(i = 0; i < someNums.length; ++i)
        tot += someNums[i];
      System.out.println("Sum is: " + tot);
      avg = (tot / someNums.length);
      System.out.println("Average is " + tot * 1.0 / someNums.length);
   }
}
