package problemSolving;

public class minMaxSum {
  public static void minMax(int arr[]) {
    int n = arr.length;
    int sum = 0;
    int indiSum[] = new int[n];
    int temp = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println("Total sum is "+sum);

    for (int j = 0; j < arr.length; j++) {
      indiSum[j] = sum - arr[j];
      System.out.println(indiSum[j]);
    }

    int max=indiSum[0];
    int min=indiSum[0];

    for(int k=0; k<n;k++)
    {
      if(min>indiSum[k])
      {
        min=indiSum[k];
      }

      if(max<indiSum[k])
      {
        max=indiSum[k];
      }
    }


    System.out.println("smallest and largest sum are: "+min+ " "+max);
  }

  public static void main(String args[]) {
    int a[] = {7, 2, 3, 4, 5};
    minMax(a);
  }
}

