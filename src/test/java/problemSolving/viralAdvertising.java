package problemSolving;

public class viralAdvertising {
  public static void viralAdvertising(int n) {
    int cumLike = 0;
    int shared = 5;
    int peopleWhoLike = 0;
    int x = 0;
    for (int i =1; i <= n; i++) {
      peopleWhoLike = shared / 2;

      cumLike = cumLike + peopleWhoLike;
      System.out.println("People who like at the end of" + i+":   " + peopleWhoLike);

      shared = peopleWhoLike * 3;
      System.out.println("People who shared at the end of" + i+":  " + shared);
      System.out.println("Likes at the end of Day "+i+1+" :"+cumLike);
    }
    System.out.println("Total likes on the advertisement are " + cumLike);
  }

  public static void main(String[] args) {
    viralAdvertising(5);
  }

}
