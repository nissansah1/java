import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            System.out.print("Please enter a number: ");
            int A = sc.nextInt(); 
            int mul=1;

            for(int i=1;i<=10; i++){
                mul = A*i;
                System.out.println(A+" * "+ i + " = " + mul);
            }
        sc.close();
    }
}
