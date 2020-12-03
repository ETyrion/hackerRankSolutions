package org.example;
import java.util.*;

public class StringChars_Day6 {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan= new Scanner(System.in);
    String eList="";
    String oList="";
    String str=scan.next();
    for(int i=0; i<str.length();)
    {
      eList=eList+str.charAt(i);
      i=i+2;
    }

    for(int j=1; j<str.length();)
    {
      oList=oList+str.charAt(j);
      j=j+2;
    }

    System.out.print(eList+" "+oList);
  }
}
