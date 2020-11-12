package problemSolving;

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

public class angryProfessor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {

      int count=0;
      String y="YES";
      String n="NO";
      for(int i=0; i<a.length;i++)
      {
        if(a[i]<=0)
        {
          count++;
        }
      }

      if(count>=k)
      {
        return n;
      }
      else
      {
        return y;
      }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      int e1=3; //students expected in the class on or before time for input 1
      int e2= 2; //students expected in the class on or before time for input 2
      int t1[]={-1,-3,4,2}; //array showing arriving time of students if <0 they arrived on time
      int t2[]={0,-1,2,1};
      String isCancelled;
      isCancelled=angryProfessor(e1,t1);
      System.out.println(isCancelled);
      isCancelled=angryProfessor(e2,t2);
      System.out.println(isCancelled);
      /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int t = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int tItr = 0; tItr < t; tItr++) {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
          int aItem = Integer.parseInt(aItems[i]);
          a[i] = aItem;
        }

        String result = angryProfessor(k, a);

        bufferedWriter.write(result);
        bufferedWriter.newLine();
      }

      bufferedWriter.close();

      scanner.close();*/
    }

}
