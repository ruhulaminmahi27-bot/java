import java.util.Scanner;
public class LargerThree {
    public static void main(String [] args){
        int large;
    Scanner Number = new Scanner(System.in);
    System.out.print("Enter number1 :");
    int a = Number.nextInt();
    System.out.print("Enter number2 :");
    int b = Number.nextInt();
    System.out.print("Enter number3 :");
    int c = Number.nextInt();
    if (a>b && a>c)
    {
        large=a;
    }
    else if(b>a && b>c)
    {
        large=b;
    }
    else
    
        large=c;
    
    System.out.print(large +" is largest among the three numbers");
    }
}
