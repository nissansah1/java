import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            System.out.print("Please enter a number: ");
            int A = sc.nextInt(); 

            int i=0;
            do{
                System.out.println(i);
            i++;
            }
            while(i<=A);
        sc.close();
    }
}