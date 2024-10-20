// import java.util.Scanner;

//  public class bubble{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
            
//             /*enter size of an array*/
//             System.out.print("Please enter a arr size number: ");
//             int size = sc.nextInt();

//             /*declare array outside of loop with size assign* and store value */           
//             int Arr[]= new int[size];
            
//             for (int i=0; i<Arr.length; i++) {
//                 /*value taken upto Arr.length*/
//                 System.out.print("Please enter a " + i  + " number: ");
//                 Arr[i] = sc.nextInt();  
//             }

//             // /* print array length */
//             // System.out.println("Array length is : "+ Arr.length);
            
            
//             /*bubble sort      time complexity :- o(n^2)  */
//             for (int i=0; i<size-1; i++) {
//                  for (int j=0; j<size-i-1; j++) {
//                   if (Arr[j]>Arr[j+1]){
//                     int temp = Arr[j];     /*Arr[i] value save in temp sequentialy*/
//                     Arr[j] = Arr[j+1];     /*Arr[i+1] value save in Arr[i] sequentialy */ 
//                     Arr[j+1] = temp;       /*temp value save in Arr[i+1] sequentialy*/
//                   }
//                 }
//             }
//             for (int i=0; i<Arr.length; i++) {
//             System.out.print (" "+ Arr[i]); 
//             } 
//             System.out.println();
//         sc.close();
//     }
// }






/*worst case of bubble sort */
// import java.util.Scanner;

//  public class  bubble{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
            
//             /*enter size of an array*/
//             System.out.print("Please enter a arr size number: ");
//             int size = sc.nextInt();

//             /*declare array outside of loop with size assign* and store value */           
//             int Arr[]= new int[size];
            
//             for (int i=0; i<Arr.length; i++) {
//                 /*value taken upto Arr.length*/
//                 System.out.print("Please enter a " + i  + " number: ");
//                 Arr[i] = sc.nextInt();  
//             }

//             for(int i=0 ; i<size-1; i++){
//                 for(int j=0 ; j<size-1; j++){
//                     for(int k=0 ; k<size-i-j; k++){               

//                         if (Arr[j]>Arr[j+k]){
//                             int temp= Arr[j+k];
//                             Arr[j+k]=Arr[j];
//                             Arr[j]=temp;
//                      }
//                    } 
//                 }            
//             }
//             for (int i=0; i<Arr.length; i++) {
//             System.out.print (" "+ Arr[i]); 
//             } 
//             System.out.println();

//         sc.close();
//     }
// }





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

            for(int i=0 ; i<size-1; i++){ //outer loop >> once outer == all inner loop

               int smallestIndex=i; //assign index in smallest
                
                 for(int j=i+1 ; j<size; j++){      //inner loop>> iterate all array except i+1

                      if (Arr[smallestIndex]>Arr[j]){  // check value which value is smaller    
                        smallestIndex=j;  // assign smallest index in smallestIndex 
                      }    
                 }
                int temp= Arr[smallestIndex];   /*it swap the index value to that smallest value on that index*/
                Arr[smallestIndex]=Arr[i];
                Arr[i]=temp;
              }
            

            for (int i=0; i<Arr.length; i++) {     //print output of this sorted array
            System.out.print (" "+ Arr[i]); 
            } 
            System.out.println();

        sc.close();
         }
}