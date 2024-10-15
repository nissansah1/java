import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            System.out.print("Please enter a number: ");
            int A = sc.nextInt(); 

            int i=0;
            while(i<=A){
            System.out.println(i);
            i++;
            }
        sc.close();
    }
}
