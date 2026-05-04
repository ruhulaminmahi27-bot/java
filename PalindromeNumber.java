import java.util.Scanner;
public class PalindromeNumber 
{
    public static void main(String[] args){
        int reverse =0, lastdigit;
    Scanner Number = new Scanner(System.in);
    System.out.print("Enter a number:");
    int n = Number.nextInt();
    int original =n;
    while(n!=0)
    {
        lastdigit =n%10;
        reverse =(reverse*10) + lastdigit ;
        n=n/10;
    }
    if(reverse==original)
    {
        System.out.print(original + " is palindrome number");
    }
    else
        System.out.print(original + " is not palindrome number");
    }
}
