import java.util.Scanner;
public class Goldbach {

    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);
        System.out.print("Enter an even number greater than 2: ");
        int n = Number.nextInt();
        if (n <= 2 || n % 2 != 0) 
        {
            System.out.println("Invalid input. Please enter an even number > 2.");
        } else 
        {
            findGoldbachPairs(n);
        }
        Number.close();
    }
    public static void findGoldbachPairs(int n) {
        System.out.println("Prime pairs for " + n + " are:");
        boolean found = false;

        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                found = true;
            }
        }

        if (!found) {
            System.out.println("No pairs found (this would actually disprove the conjecture!)");
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
