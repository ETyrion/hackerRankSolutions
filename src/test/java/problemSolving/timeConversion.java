package problemSolving;

public class timeConversion {

  public static void timeCoversion(String s)
  { //HH:MM:SSAM
    int h1= (int) s.charAt(1)- '0';
    int h2= (int) s.charAt(0)- '0';
    int hh=(h2*10+h1);
    System.out.println(hh);
    int i=0;
    if((s.charAt(8)=='a') ||(s.charAt(8)=='A'))
    {
      if(hh==12)
      {
        System.out.print("00");
        for(i=2;i<8;i++)
        {
          System.out.print(s.charAt(i));
        }
      }

      else
        for(i=0;i<8;i++)
        {
          System.out.print(s.charAt(i));
        }
    }

    else
    {
      if(hh==12)
      {
        System.out.print(hh);
        for(i=2;i<8;i++)
        {
          System.out.print(s.charAt(i));
        }
      }
      else
      {
        hh=hh+12;
        System.out.print(hh);
        for(i=2;i<8;i++)
        {
          System.out.print(s.charAt(i));
        }
      }
    }
  }

  public static void main(String[] args)
  {
    timeCoversion("11:45:12pM");
  }
}


