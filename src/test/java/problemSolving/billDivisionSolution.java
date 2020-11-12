package problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class billDivisionSolution {

  // Complete the bonAppetit function below.
  static void bonAppetit(List<Integer> bill, int k, int b) {
    int calculatedBill=0;
    int totalItems=bill.size();
    int ana = bill.get(k); //Item that she didn't have
    int totalbill=0;
    int difftopay=0;
    for(int i=0;i<totalItems; i++)
    {
      calculatedBill = calculatedBill+bill.get(i);
    }

    totalbill= (calculatedBill-ana)/2;
    if(totalbill==b)
    {
      System.out.println("Bon Appetit");
    }

    else
    {
      difftopay=b-totalbill;
      System.out.println(difftopay);
    }


  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int n = Integer.parseInt(nk[0]);

    int k = Integer.parseInt(nk[1]);

    String[] billItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    List<Integer> bill = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int billItem = Integer.parseInt(billItems[i]);
      bill.add(billItem);
    }

    int b = Integer.parseInt(bufferedReader.readLine().trim());

    bonAppetit(bill, k, b);

    bufferedReader.close();
  }
}

