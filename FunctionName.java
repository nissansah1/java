/*    import java.util.Scanner;

    public class  FunctionName{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
                
                System.out.print("Please enter a number: ");
                int A = sc.nextInt(); 


            sc.close();
        }
    }
*/



/*
    public class FunctionName {
        // Static method (acting like a function)
        public static int add(int a, int b) {
            return a + b; // Returns the sum of a and b
        }

        public static void main(String[] args) {
            // Calling the static method
            // int result = add(5, 10);
            System.out.println("The sum is: " + add(5, 10));
        }
    }
*/

import java.util.Scanner;

public class FunctionName{
    public static String Name(String naam){
        System.out.println("My name is "+ naam);
    }
}


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            System.out.print("Please enter a number: ");
            String naam = sc.nextLine(); 

            FunctionName.Name(naam);
        sc.close();
    }
}
