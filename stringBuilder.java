import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            /*first value ko input lena */
            System.out.print("Please enter a number: ");
            String A = sc.nextLine(); 

            /*  A value ko stringBuilder pe assign kar raha hai */
            StringBuilder B= new StringBuilder(A);

            /*   string value ko add karna from that index */
            B.insert(3,"hello");
            System.out.println(B);

            /* String value ko piche se add karna*/
            B.append(" thank you");
            System.out.println(B);

            /*String value ko replace/update karne between two index*/
            B.replace(2,4, "yanepal ");
            System.out.println(B);

            /*String value ko delete karna between two index */
            B.delete(2,4);
            System.out.println(B);

            /*String value ka length pata karna  */
            System.out.println(B.length());


            /*String value ko reverse karna   */
            System.out.println(B.reverse());

        sc.close();
    }
}
