import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner _input = new Scanner(System.in);
    String x = "*";
    System.out.print("Enter base of the triangle: ");
    
    int base = _input.nextInt();

    for (int i = base; i > 0; i--){
      System.out.printf("%s\n", x.repeat(i));
    }
    
    
  }
}
