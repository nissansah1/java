import java.util.Scanner;

public class  swap{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            System.out.print("Please enter  First number: ");
            int num1 = sc.nextInt(); 

            System.out.print("Please enter Second number: ");
            int num2 = sc.nextInt(); 

            int temp = num1; /*num1 value save in temp sequentialy*/
            num1 = num2;     /*num2 value save in num1 sequentialy */ 
            num2 = temp;     /*temp value save in num2 sequentialy*/

            System.out.println(" First number: "+ num1);
            System.out.println(" Second number:"+ num2);
        sc.close();
    }
}


/*              flowchart 
            
            ¥--------,   ¥--------,
          | t |      | 1 |     | 2 |
          |___|      |___|     |___|
            '--------------------^         


*/            