package problemSolving;

import java.util.Scanner;

public class ServiceLane {
  public static void serviceLane(int[] widthOfRoad, int entryPoint, int exitPoint)
  {
    int maxVeh=widthOfRoad[entryPoint];

    int temp=0;
    for(int i=entryPoint;i<=exitPoint; i++)
    {
      for(int j=i+1; j<exitPoint;j++)
      {
        if(widthOfRoad[i]>=widthOfRoad[j])
        {
          temp = widthOfRoad[i];
          widthOfRoad[i] = widthOfRoad[j];
          widthOfRoad[j] = temp;
        }
      }
      maxVeh=widthOfRoad[entryPoint];
    }
    System.out.print(maxVeh);
  }

  public static void main(String[] args){
    int[] width={2,3,1,2,3,2,3,1,3,4,4,2,3,4};
    int entry;
    int exit;
    Scanner scan= new Scanner(System.in);
    System.out.println("Provide entry point");
    entry=scan.nextInt();
    System.out.println("Provide exit point");
    exit=scan.nextInt();
    scan.close();
    serviceLane(width,entry,exit);
    //System.out.print(width[2]);
    //serviceLane(a,arr);

  }
}
