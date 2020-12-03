package problemSolving;

public class MarsSolution {
  public static int marsExploration(String s) {
    int len=s.length();
    int changedChar=0;
    int count=0;
    for(int i=0;i<len;i++)
    {
      System.out.println(s.charAt(i));
      if((s.charAt(i)=='S')|| (s.charAt(i)=='O'))
      {
        count++;
      }
    }
    changedChar=len-count;
    System.out.println(changedChar);
    return changedChar;
  }
  public static void main(String[] args)
  {
    marsExploration("SOSSOTSOPPOS");
  }
}
