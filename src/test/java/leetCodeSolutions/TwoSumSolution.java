package leetCodeSolutions;

import java.util.ArrayList;

public class TwoSumSolution {
  public static void twoSum(int[] nums, int target)
  {
    /*ArrayList<Integer> ar= new ArrayList<>();
    int start=0;
    int end=0;*/
    int[] op = new int[2];
    for(int i=0; i<nums.length; i++)
    {
      for(int j=i+1; j<nums.length; j++)
      {
        if((nums[i]+nums[j])==target)
        {
          op[0]=i;
          op[1]=j;
        }
      }
    }

    /*System.out.print("[ "+start+","+end+" ]");
    System.out.println(ar);*/
      System.out.print("[ " + op[0] + ", " + op[1] + "]");

  }

  public static void main(String[] args)
  {
    int[] ar={3,6,4,1,9};
    int sum= 15;
    twoSum(ar, sum);
  }
}
