package problemSolving;
/*A person eats cupcakes but will have to walk certain miles. Each cupcake represents a calorie count
* in the array. Suppose he eats cup ckaes having calorie count 3,4,7 then he will have to walk
* 2^0*3, 2^1*4, 2^2*7 distance for each one. Find the minimum amount of distance that he'll have to walk*/
public class MarcCalorie {
  public static void calorieCount() {
    int a[]= {7,4,9,6};
    double dis = 0;
    int temp=0;
    int len=a.length;
    for(int i=0;i<len;i++)
    {
      for (int j =i+1; j<len; j++)
      {
        if (a[i]<a[j])
        {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
      for(int u=0; u<len;u++)
      {
        System.out.print(" "+a[u]);
      }
      for(int k=0; k<len; k++)
      {
        dis = dis +a[k]*Math.pow(2,k);
      }
      System.out.println(" " +dis);
    }

    /*for (int i = 0; i < a.length; i++) {
      dis = dis + (Math.pow(2, i)) * a[i];
      System.out.println("Product of "+a[i]+"with" +i+ " is "+dis);

    }

    System.out.println(dis);*/

  public static void main(String[] args) {
    //int arr[] = {1,3,2,5};
    calorieCount();
  }
}
