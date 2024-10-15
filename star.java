import java.util.Scanner;

public class star  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            System.out.print("Please enter a number: ");
            int A = sc.nextInt(); 

            for(int i=1; i<=A ; i++){
                for(int j=1; j<=A+5 ; j++){
                    System.out.print(" * ");
                }
            System.out.println();
            }
        sc.close();
    }
}
