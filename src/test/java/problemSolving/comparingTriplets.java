package problemSolving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;


//problem: Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
//
//The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).
//
//The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
//
//If a[i] > b[i], then Alice is awarded 1 point.
//If a[i] < b[i], then Bob is awarded 1 point.
//If a[i] = b[i], then neither person receives a point.
//Comparison points is the total points a person earned.
//
//Given a and b, determine their respective comparison points.

public class comparingTriplets {

  // Complete the compareTriplets function below.
  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int acount=0;
    int bcount=0;
    List<Integer> totalCount= new ArrayList<Integer>();
    int alice[] = new int[a.size()];
    //int bob[] = new int[b.size()];
    //a.listToArray(alice);
    //b.listToArray(bob);
    for(int i=0; i<a.size(); i++)
    {
      if(a.get(i)>b.get(i))
      {
        acount++;
      }

      else if(a.get(i)<b.get(i))
      {
        bcount++;
      }
    }

    totalCount.add(acount);
    totalCount.add(bcount);
    return totalCount;
  }

  public static void main(String[] args) throws IOException {
    /*
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> result = compareTriplets(a, b);

    bufferedWriter.write(
        result.stream()
            .map(Object::toString)
            .collect(joining(" "))
            + "\n"
    );

    bufferedReader.close();
    bufferedWriter.close();*/
  }
}

