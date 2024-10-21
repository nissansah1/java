/* just print output without loop */
// import java.util.Scanner;

//  public class array {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

            
//             // System.out.print("Please enter a number: ");
//             int[] a= {1,2,3,4,5,6,7}; 

//             System.out.println(a[1]);
//             System.out.println(a[2]);
//             System.out.println(a[3]);
//             System.out.println(a[0]);
//             System.out.println(a[4]);
//             System.out.println(a[5]);
//             System.out.println(a[6]);
//         sc.close();
//     }
// }



/* just print output*/
// import java.util.Scanner;

//  public class array {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

            
//             //System.out.print("Please enter a number: ");
//             int[] a= {1,2,3,4,5,6,7};
            
//             for (int i=0; i < a.length; i++) 
//                 System.out.print(a[i]);
//         sc.close();
//     }
// }



/*declare size first */
// import java.util.Scanner;

//  public class array {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

            
//              int a[]=new int[1];       
//             for (int i=0; i < a.length; i++) {
//                 System.out.print("Please enter a number: ");
//                 a[i] = sc.nextInt();
//             }
            
//             for (int i=0; i <= a.length; i++){ 
//                 System.out.println(a[i]);
//             }
//         sc.close();
//     }
// }




/*simple input and output */
// import java.util.Scanner;

//  public class array {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//             int[] a = new int[5];
             
//             for (int i=0; i < a.length; i++) {
//                 System.out.print("Please enter a number: ");
//                 a[i] = sc.nextInt();
//             }
            
//             for (int i=0; i < a.length; i++) 
//                 System.out.println(a[i]);
//         sc.close();
//     }
// }


/* declare size and simple input and output*/
// import java.util.Scanner;

//  public class array {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Ask the user for the array size
//         System.out.print("Enter the number of elements in the array: ");
//         int size = sc.nextInt(); // Store array size

//         // Declare and initialize the array
//         int[] a = new int[size]; // Initialize array of given size

//         // Input array elements from the user
//         for (int i = 0; i < a.length; i++) {
//             System.out.print("Please enter a number: ");
//             a[i] = sc.nextInt(); // Store each input into the array
//         }

//         // Print the array elements
//         System.out.println("The elements in the array are: ");
//         for (int i = 0; i < a.length; ++i) {
//             System.out.print(a[i]); // Output each element
//         }

//         sc.close();
//     }
// }


/*declare and initialize var in loop , cann 0nly access only in loop */
// import java.util.Scanner;

//  public class array {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

            
//             // System.out.print("Please enter a number: ");
//             int[] a= {1,2,3,4,5,6,7};
            
//             for (int i=0; i < a.length; i++) {
//                         int sum=0;
//                         sum =sum + a[i];     
//                         System.out.println("answer" + sum);
//             }

//         sc.close();
//     }
// }


/* declare size and simple input and  print reverse output*/
// import java.util.Scanner;

//  public class array {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Ask the user for the array size
//         System.out.print("Enter the number of elements in the array: ");
//         int size = sc.nextInt(); // Store array size

//         // Declare and initialize the array
//         int[] a = new int[size]; // Initialize array of given size

//         // Input array elements from the user
//         for (int i = 0; i < a.length; i++) {
//             System.out.print("Please enter a "+i+ " number: ");
//             a[i] = sc.nextInt(); // Store each input into the array
//         }
//         sc.nextLine();

//         // Print the reverse array elements
//         System.out.println("The elements in the array are: ");
//         for (int i=a.length-1; i >= 0 ; i--) {
//             System.out.print(a[i]); // Output each element
//         }

//         sc.close();
//     }
// }

