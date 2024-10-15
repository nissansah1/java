import java.util.Scanner;

public class Sum_Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            System.out.print("Please enter a number: ");
            int A = sc.nextInt(); 
            
            int sum=0;
            for(int i=0; i<=A; i++){
                sum=sum+i;
                System.out.println(sum);
            }
            
        sc.close();
    }
}
