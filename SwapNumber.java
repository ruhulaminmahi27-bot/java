import java.util.Scanner;
public class SwapNumber 
{
   public static void main(String [] args){
    Scanner Number = new Scanner(System.in);
    System.out.print("Enter number1 :");
    int a = Number.nextInt();
    System.out.print("Enter number2 :");
    int b = Number.nextInt();
    System.out.println("Before swap number1="+a+" and number2="+b);
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println("After swap number1="+a+" and number2="+b);
   } 
}
