public class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        int num = 135;
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;      // get last digit
            sum += digit * digit * digit;  // cube of digit
            num /= 10;                 // remove last digit
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

    }
}
