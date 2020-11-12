package problemSolving;
/*The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class utopianTree {

    // Complete the utopianTree function below.
   public static int utopianTree(int n) {
      int height=1;

      if(n==0)
      {
        return height;
      }
      else
      {
        for(int i=1;i<=n;i++)
        {
          if((i%2)==0)
          {
            height=height+1;
          }
          else
          {
            height=height*2;

          }
        }
        return (height);
      }
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     int height;
     height=utopianTree(5);
     System.out.println(height);

      /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int t = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int tItr = 0; tItr < t; tItr++) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = utopianTree(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
      }

      bufferedWriter.close();

      scanner.close();*/
    }

}
