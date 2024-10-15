// input and output no. of array
// import java.util.Scanner;

//  public class search_array {
//     public static void main(String[] args) {

//         // Scanner ka object bana rahe hain taaki user input le sakein
//         Scanner sc = new Scanner(System.in);
        
//         // User se array ka size maang rahe hain
//         System.out.print("Please enter a size number: ");
//         int size = sc.nextInt(); // User se ek number le rahe hain jo array ka size hoga

//         // Ek naya array bana rahe hain jiska size user ne diya hai
//         int[] A = new int[size]; // 'size' ke hisaab se array A bana diya

//         // Ye loop array ke har index pe ek number input karega
//         for (int i = 0; i < size; i++) { // Loop array ke har element par chalega
//             System.out.print("Please enter a " + i + "  number: "); // User ko guide kar rahe hain ki woh kaunsa number daale
//             A[i] = sc.nextInt(); // User ka input array ke i-th position pe save ho raha hai
//         }

//         // Ab array ke values ko print karenge
//         for (int i = 0; i < A.length; i++) { // Har element ko loop se print karenge
//             System.out.println("value of A is " + i + "   number: " + A[i]); // Array ke index aur value ko print kar rahe hain
//         }

//         // Scanner object ko close kar rahe hain
//         sc.close(); // Memory leak se bachne ke liye scanner close karna zaroori hai
//     }
// }





// import java.util.Scanner;

//  public class search_array {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Ask user to input the size of the array
//         System.out.print("Please enter a size number: ");
//         int size = sc.nextInt();

//         // Initialize the array with the specified size
//         int[] A = new int[size];

//         // Loop to take array inputs from the user
//         for (int i = 0; i < size; i++) {
//             System.out.print("Please enter a number at index " + i + ": ");
//             A[i] = sc.nextInt();
//         }

//         // Ask user to input the number to search for
//         System.out.print("Please input search number: ");
//         int Find = sc.nextInt();

//         // Flag to track if the number is found
//         boolean found = false;

//         // Loop to search the number in the array
//         for (int i = 0; i < A.length; i++) {
//             if (Find == A[i]) {
//                 System.out.println("Number found at index " + i);
//                 found = true; // Set the flag to true
//                 break; // Exit the loop once the number is found
//             }
//         }

//         // If the number is not found in the entire array
//         if (!found) {
//             System.out.println("Number not found in the array.");
//         }

//         sc.close();
//     }
// }



import java.util.Scanner;


 public class search_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a size number: ");
            // int size= sc.nextInt();

            // int[] A = new int[size];

            // for (int i=0; i<size; i++){
            //     System.out.print("Please enter a "+ i + "  number: ");
            //     A[i]= sc.nextInt();
            // }

            //     System.out.print("please input search number: ");
            //     int Find=sc.nextInt();
            
            int[] A={1,2,3,4,5,6,7,8,9};

            for (int i=0; i<A.length; i++){            
             if (Find== A[i]){
               System.out.println("number found "+i); 
               break;
             }

            if (Find!= A[i]){
               System.out.println("number found at "+i); 
               break;
             }
            }
            

        sc.close();
    }
} 
