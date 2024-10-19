import java.util.Scanner;

public class bubble{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            /*enter size of an array*/
            System.out.print("Please enter a arr size number: ");
            int size = sc.nextInt();

            /*declare array outside of loop with size assign* and store value */           
            int Arr[]= new int[size];
            for (int i=0; i<Arr.length; i++) {

                /*value taken upto Arr.length*/
                System.out.print("Please enter a " + i  + " number: ");
                Arr[i] = sc.nextInt();  
            }

            // /* print array length */
            // System.out.println("Array length is : "+ Arr.length);
            
            
            /*bubble sort*/
            for (int i=0; i<size-1; i++) {
                 for (int j=0; j<size-i-1; j++) {
                  if (Arr[j]>Arr[j+1]){
                    int temp = Arr[j];     /*Arr[i] value save in temp sequentialy*/
                    Arr[j] = Arr[j+1];     /*Arr[i+1] value save in Arr[i] sequentialy */ 
                    Arr[j+1] = temp;       /*temp value save in Arr[i+1] sequentialy*/
                  }
                }
            }
            for (int i=0; i<Arr.length; i++) {
            System.out.print (" "+ Arr[i]); 
            } 
            System.out.println();
        sc.close();
    }
}

