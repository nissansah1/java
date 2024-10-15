import java.util.Scanner; // Import Scanner class for user input

public class Conditional{

    public static void main(String[] args) {
        // Create a Scanner object to take user input

            Scanner sc= new Scanner(System.in); 
            
            // Prompt the user to enter a number
            System.out.print("Please enter a number: ");
            int number = sc.nextInt(); // Read and store user input
            
            // Conditional check for the entered number
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
            sc.close();

    }
}
