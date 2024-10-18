
   /* Bit Shifter*/ 
// import java.util.Scanner;

//  public class Bitwise {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//             /*input the N value*/
//             System.out.print("Please enter N number: ");
//             int N = sc.nextInt(); 


//             /*input the I value*/
//             System.out.print("Please enter I number: ");
//             int I = sc.nextInt(); 

//             // Leftover newline consume karo
//             sc.nextLine();  // Yeh leftover newline character consume karega

//             /*input the shift selector*/
//             System.out.print("Please enter shift selector: ");
//             String Shift = sc.nextLine();

//             switch (Shift) {
//             case ">>":
//                 System.out.print("right shift selector:" + (N >> I) );
//                 break;  
//             case "<<":
//                 System.out.print("left shift selector: " + (N << I) );
//                 break;

//                }
//         sc.close();
//     }
// }



    /* get the 3rd bit (position 2) of a number n {n=0101}
      Bit Mask : N shifter I   {shifter :<<}
      operation :And 
    */

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            /*input the N value*/
            System.out.print("Please enter N number: ");
            int N = sc.nextInt(); 
            sc.nextLine(); 

            /*input the I value*/
            System.out.print("Please enter I number: ");
            int I = sc.nextInt(); 

            // Leftover newline consume karo
            sc.nextLine();  // Yeh leftover newline character consume karega

            /*input the shift selector*/
            System.out.print("Please enter shift selector: ");
            String Shift = sc.nextLine();


            int Right = 0;  // Right shift ka result store karega
            int Left = 0;   // Left shift ka result store karega


            switch (Shift) {  //select which shift you want to use 
            case ">>":
                System.out.print("right shift selector:" + (N >> I) );
                Right = N >> I;
                break;  
            case "<<":
                System.out.print("left shift selector: " + (N << I) );
                Left = N << I;
                break;
               }


            // Leftover newline consume karo
            sc.nextLine();  // Yeh leftover newline character consume karega

            /*input the Next value*/
            System.out.print("Please enter Next operand number: ");
            int Next = sc.nextInt(); 
            sc.nextLine(); 


                /*select bitwise_operation*/
            System.out.print("Please enter bitwise_operation : ");
            String bitwise_operation = sc.nextLine(); 

            switch (bitwise_operation) {  //select which shift you want to use 
              case "&":       /*nested loop*/
                                System.out.print("Please enter Select_operend : ");
                                String Select_operand = sc.nextLine();

                                switch (Select_operand) {  //select which shift you want to use 
                                     case "r":
                                             System.out.println("get bit (&) value is : "+ (Next & Right ));
                                                          break;

                                     case "l":
                                            System.out.println("get bit (&) value is : "+ (Next & Left ));
                                                          break;
                                  }
                break;

              case "|":          /*nested loop*/
                                System.out.print("Please enter Select_operend : ");
                                String select_operand = sc.nextLine();

                                switch (select_operand) {  //select which shift you want to use 
                                     case "r":
                                             System.out.println("set bit (|) value is : "+ (Next & Right ));
                                                          break;

                                     case "l":
                                            System.out.println("set bit (|) value is : "+ (Next & Left ));
                                                          break;
                                  }
                break;
               }           
    
        sc.close();
    }
}
