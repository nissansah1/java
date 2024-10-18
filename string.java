// import java.util.Scanner;

//  public class  string{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
            
//             System.out.print("Please enter a name: ");
//             String A = sc.nextLine(); 

//             System.out.print("Your name is "+ A);
//         sc.close();
//     }
// }



/*concatination*/
// import java.util.Scanner;

//  public class  string{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//             System.out.print("Please enter a number: ");
            
//             String head = sc.nextLine(); 
//             String tail = sc.nextLine();
//             String fullName = head + tail;

//             System.out.println("fullName is : "+fullName);

//        /*     find length*/
//             System.out.print("fullName is : "+fullName.length() );
//         sc.close();
//     }
// }
   



/*compareTo()*/
import java.util.Scanner;

 public class  string{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            /*first input*/
            System.out.print("Please enter a first name: ");
            String A = sc.nextLine(); 

            /*second input*/
            System.out.print("Please enter a second name: ");
            String B = sc.nextLine(); 


            System.out.print("Your name is "+ A.compareTo(B));
        sc.close();
    }
}