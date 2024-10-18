import java.util.Scanner;

public class operator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            /*input first number */
            System.out.print("Please enter a first number: ");
            float A = sc.nextFloat(); 

            /*input second number */
            System.out.print("Please enter a second number: ");
            float B = sc.nextFloat(); 





            /*/*//*/*Arithmetic operation*//**/ 

            /* Addition*/
            System.out.println( "Addition value is :" +(A+B) + "\n");  

            /* Subtraction */
            System.out.println( "Subtraction value is :" +(A-B) + "\n");

            /* multiplication*/
            System.out.println( "multiplication value is :" +(A*B) + "\n");

            /* Division*/
            System.out.println( "Division value is :" +(A/B) + "\n"); 

            /* modulo*/
            System.out.println( "modulo value is :" +(A%B) + "\n");    





            /*/*//*/*unary operation*//**/     

            /*pre_increment addition */ //first value update then use 
            System.out.println( "pre_increment addition value is :" + (++A) + "\n");

            /*post_increment addition */   //first value use then update
            System.out.println( "post_increment addition value is :" + (A++) + "\n");

            /*pre_increment sub */ //first value update then use 
            System.out.println( "pre_increment  sub value is :" + (--A) + "\n");

            /*post_increment sub */   //first value use then update
            System.out.println( "post_increment sub value is :" + (A--) + "\n");





            /*/*//*/Ternary operation**//**/   
            String ternary = (A==B)? "true" : "False";
            System.out.println( "ternary value is :" + ternary + "\n");






            /*/*//*/*relational operation*//**/

            /* equal to */
            System.out.println( "equal to value is :" + (A==B) +"\n");

            /* less_than  */
            System.out.println( "less_than value is :" + (A<B) +"\n");

            /* greater_than  */
            System.out.println( "greater_than value is :" + (A>B) +"\n");

            /* greater_than_equal_to */
            if (A>=B){
               System.out.println( "greater_than_equal_to value is : yes"  +"\n");
            }else{
               System.out.println( "greater_than_equal_to value is : No"  +"\n");
            }

            /* less_than_equal_to */
            if (A<=B){
               System.out.println( "Less_than_equal_to value is : yes"  +"\n");
            }else{
               System.out.println( "Less_than_equal_to value is : No" +"\n" );
            }

            /* not equal to */
            System.out.println( "Not equal to value is :" + (!(A==B)) +"\n");






            /*/*//*/*Logical operation*//**/

            /* And */
            if (A== 4.0 && B== 4){
               System.out.println( "And value is : yes"  +"\n");
            }else{
               System.out.println( "And value is : No"  +"\n");
            }

            /* Or  */
            if (A== 4.0 || B== 4){
               System.out.println( "Or value is : yes"  +"\n");
            }else{
               System.out.println( "Or  value is : No"  +"\n");
            }

            /* not  */
            System.out.println( "Not value is :" + (!(A==B)) +"\n");           
        sc.close();
    }
}
