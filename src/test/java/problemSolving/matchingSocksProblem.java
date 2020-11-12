package problemSolving;

public class matchingSocksProblem {

  public static void pairCount(int arr[]) {
    //int count = 0;
    int pairs=0;
    int i = 0;
    int j = 0;
    for (i = 0; i < arr.length; i++)
    {
      int count=0;
      for (j = 0; j < arr.length; j++)
      {
        if ((j<i) && (arr[i] == arr[j])) break;
        if(arr[i]==arr[j])

          count++;

      }
      pairs=pairs+count/2;
    }

    System.out.println(pairs);
  }

  public static void main(String[] args) {
    int a[] = {1, 1, 2, 1, 3, 3,2, 4, 4};
    pairCount(a);
  }
}
