import java.util.Scanner;
public class PrimeNumber import java.util.Scanner;
public class PrimeNumber 
{
    public static void main(String[] args)
    {
        int i;
        Scanner Number = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = Number.nextInt();
        for(i=2;i<=num;i++)
        {
            if(num%i==0)
                break;
        }
        if(i==num)
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
{
    public static void main(String[] args)
    {
        int i;
        Scanner Number = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = Number.nextInt();
        for(i=2;i<=num;i++)
        {
            if(num%i==0)
                break;
        }
        if(i==num)
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
