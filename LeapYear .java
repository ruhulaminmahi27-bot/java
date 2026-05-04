import java.util.Scanner;
public class LeapYear 
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a year:");
        int y = num.nextInt();
        String year= ((y%4==0 && y%100!=0) || y%400==0)?"Leap year":"Not leap year";
        System.out.println(y +" is "+year);
        
    }
}
