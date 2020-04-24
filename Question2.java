import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner _input = new Scanner(System.in);
    System.out.print("Enter height: ");
    String h = _input.next();
    System.out.print("Enter weigh: ");
    String w = _input.next();
    System.out.printf("You are %sm tall, and weighs %skg \n", h,w);
  }
}
