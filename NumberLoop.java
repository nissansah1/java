import java.util.Scanner;

class NumberLoop{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            System.out.print("Please enter a number: ");
            int A = sc.nextInt(); 
            for(int i=0; i<= A; i++){
                System.out.println(i);
            }


        sc.close();
    }
}
