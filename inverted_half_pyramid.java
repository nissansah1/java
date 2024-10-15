 import java.util.Scanner;

 public class  inverted_half_pyramid{
     public static void main(String[] args) {
 
         Scanner sc = new Scanner(System.in);
             
             System.out.print("Please enter a number: ");
             int N = sc.nextInt(); 
            // Outer loop controls the rows
             for (int i=1 ; i<=N; i++){
                
                // Inner loop controls the stars in each row
                 for (int j=1; j<=N; j++){
                     System.out.print(" * ");
                 }
                 System.out.println();
             }
 
 
         sc.close();
     }
 } 



/* import java.util.Scanner;

 public class inverted_half_pyramid {
     public static void main(String[] args) {
 
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Please enter a number: ");
         int N = sc.nextInt(); 
  
         // Outer loop controls the rows
         for (int i = N; i >= 1; i--) {
             // Inner loop controls the stars in each row
             for (int j = 1; j <= i; j++) {
                System.out.print("* ");
             }
             System.out.println(); // Move to the next line after each row
         }
 
         sc.close();
     }
 }*/
