import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner Number = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = Number.nextInt();
        String Result= (n % 2 == 0)?"even":"odd";
        System.out.println(n +" is an " + Result + " number.");
    }
}
