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

public class theHurdleRace {

  // Complete the hurdleRace function below.
  public static int hurdleRace(int k, int[] height) {

    int maxheight = height[0];
    int temp = 0;
    int diff = 0;
    for (int i = 0; i < height.length; i++) {
      if (height[i] > maxheight) {
        temp = maxheight;
        maxheight = height[i];
        height[i] = temp;
      }
    }

    if (k >= maxheight) {
      return 0;
    } else {
      diff = maxheight - k;
      return diff;
    }

  }
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    int h[]={1,6,3,5,2};
    int m=4;
    int reqadjustment= hurdleRace(m,h);
    System.out.println(reqadjustment);
      /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      String[] nk = scanner.nextLine().split(" ");

      int n = Integer.parseInt(nk[0]);

      int k = Integer.parseInt(nk[1]);

      int[] height = new int[n];

      String[] heightItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < n; i++) {
        int heightItem = Integer.parseInt(heightItems[i]);
        height[i] = heightItem;
      }

      int result = hurdleRace(k, height);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();

      bufferedWriter.close();

      scanner.close();*/

  }
}



