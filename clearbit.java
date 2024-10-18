import java.util.Scanner;

public class clearbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number and the bit position to clear
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("Enter the bit position to clear (0-based index): ");
        int i = sc.nextInt();

        // Clear the bit at the given position
        int result = n & ~(1 << i);

        // Output the result
        System.out.println("Number after clearing the bit at position " + i + ": " + result);

        sc.close();
    }
}
