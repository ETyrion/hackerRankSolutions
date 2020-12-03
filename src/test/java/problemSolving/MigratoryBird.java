package problemSolving;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBird {

  public static int migratoryBirds(List<Integer> arr) {
    int type=0;
    int count=0;
    for(int i=0;i <arr.size(); i++)
    {
      for(int j=i+1; j<arr.size(); j++)
      {
        if(arr.get(i)==arr.get(j))
        {
          System.out.println("Occurence of "+arr.get(i));
          count++;
        }
      }
    }
    type=count;
    return type;
  }

  public static void main(String[] args){
    List<Integer> birds= new ArrayList<>();
    birds.add(1);
    birds.add(1);
    birds.add(2);
    birds.add(2);
    int result=migratoryBirds(birds);
    System.out.println(result);

  }
  
}
