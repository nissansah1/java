import java.util.Scanner;

class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int A = sc.nextInt();

        if (A == 1) {
            System.out.println("Hello");
        } else if (A == 2) {
            System.out.println("Namaste");
        } else if (A == 3) {
            System.out.println("Hey");
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
