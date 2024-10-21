import java.util.Scanner;

 public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            
            // System.out.print("Please enter a number: ");
            int[] a= {1,2,3,4,5,6,7};
            
            for (int i=0; i < a.length; i++) 
                System.out.println(a[i]);
        sc.close();
    }
}
