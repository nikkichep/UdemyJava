import java.util.Scanner;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Do you want a car?");
    Scanner scan = new Scanner(System.in);
    String ans1 = scan.next();

    if (ans1.equals("yes")){
      System.out.println("What is your favourite colour between            red,blue,yellow?");
      String ans2 = scan.next();

      if (ans2.equals("red")){
        System.out.println("We have it in stock");
      }
      else if(ans2.equals("blue")){
        System.out.println("We can order it");
      }
    }
    else {
      System.out.println("No worries have a good day");
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}