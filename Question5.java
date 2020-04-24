import java.util.Scanner;
import java.util.Arrays;
public class Question5
{
  
  public static int[] addX(int n, int arr[], int x) 
    { 
        int i; 
        int newarr[] = new int[n + 1]; 
        for (i = 0; i < n; i++) 
            newarr[i] = arr[i]; 
  
        newarr[n] = x; 
  
        return newarr; 
    } 
  
   public static int mode(int[] input) {

    int[] count = new int[101];

    for (int i=0; i < input.length; i++) {
        count[input[i]]++;
    }
     
    int index = count.length-1;
    for (int i=count.length-2; i >=0; i--) {
        if (count[i] >= count[index])
            index = i;
    }

    return index;
}
  public static void main(String[] args)
  {
     Scanner _input = new Scanner(System.in);
    
     System.out.print("Enter the amount of number to be keyed in: ");
     int count = _input.nextInt();
    
     int arry[] = new int[] {};

     for (int i = count; i > 0; i--){
       System.out.print("Enter one number at a time: ");
       int digit = _input.nextInt();
       arry = addX(arry.length, arry, digit);
     }

     int result = mode(arry);
     System.out.print("The mode is " + result);

  }
}
