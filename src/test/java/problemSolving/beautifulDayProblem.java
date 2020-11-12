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

public class beautifulDayProblem {
  // Complete the beautifulDays function below.
  public static int beautifulDays(int i, int j, int k) {

    int rev = 0;
    int rem = 0;
    int count = 0;
    int q = 0;
    int diff = 0;
    int s;
    for (s = i; s <= j; s++) {
      q=s;
      System.out.println("Value of q "+q);
      while (q != 0) {
        rem = q % 10;
        rev = rev * 10 + rem;
        q = q / 10;
      }
      System.out.println("Reverser number is "+rev);
      diff = Math.abs(s - rev);
      System.out.println("Difeerence is "+diff);
      if ((diff % k) == 0) {
        count++;
      }
      rev=0;
    }
    return count;


  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    int start = 20;
    int end = 31;
    int num = 3;
    int days = beautifulDays(start, end, num);
    //System.out.println(days);

      /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      String[] ijk = scanner.nextLine().split(" ");

      int i = Integer.parseInt(ijk[0]);

      int j = Integer.parseInt(ijk[1]);

      int k = Integer.parseInt(ijk[2]);

      int result = beautifulDays(i, j, k);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();

      bufferedWriter.close();

      scanner.close();*/
  }
}

