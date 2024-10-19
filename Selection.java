import java.util.Scanner;

public class  Selection{
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

            for(int i=0 ; i<size-1; i++){
                for(int j=0 ; j<size-1; j++){
                     for(int k=0 ; k<size-i-j; k++){               

                        if (Arr[j]>Arr[j+k]){
                            int temp= Arr[j+k];
                            Arr[j+k]=Arr[j];
                            Arr[j]=temp;
                          
                           

                     }
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
