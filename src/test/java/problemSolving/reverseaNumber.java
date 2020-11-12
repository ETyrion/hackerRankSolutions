package problemSolving;

public class reverseaNumber {

  public static void rev(int n)
  {
    System.out.println(n);
    int rem=0;
    int q=n;
    int revNum = 0;
    while(q!=0)
    {
      rem=q%10;
      revNum=revNum*10+rem;
      q=q/10;
    }
    System.out.println(revNum);
  }

  public static void main(String args[])
  {
    rev(21);
  }
}
