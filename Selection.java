
/*worst case made by nissan sah */
/* this is not follow the rules of selection sort */

// import java.util.Scanner;

//  public class  Selection{
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

//             for(int i=0 ; i<size-1; i++){  //outer loop >> once outer == all inner loop
        
//                 for(int j=i+1 ; j<size; j++){ //inner loop>> iterate all array except i+1
//                     if (Arr[i]>Arr[j]){         //it check whether which is the great value                 
//                         int temp= Arr[i];
//                         Arr[i]=Arr[j];       // it swap all the smallest value again and again in array  when it find smallest then 
//                         Arr[j]=temp;         // any another smallest value in array on each iteration
//                         System.out.println (" "+ Arr[i]);  
//                    } 
//                    //System.out.println (" "+ Arr[i]); 
//                 } 

//             }
//             for (int i=0; i<Arr.length; i++) {
//             System.out.print (" "+ Arr[i]); 
//             } 
//             System.out.println();

//         sc.close();
//     }
// }




/* time complexity O (n^2)  */

// import java.util.Scanner;

//  public class  Selection{
//     public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
            
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

//             for(int i=0 ; i<size-1; i++){ //outer loop >> once outer == all inner loop     //TP (n-1,n-2.....a.p and g,p formula )

//                int smallestIndex=i; //assign index in smallest
                
//                  for(int j=i+1 ; j<size; j++){      //inner loop>> iterate all array except i+1

//                       if (Arr[smallestIndex]>Arr[j]){  // check value which value is smaller    
//                         smallestIndex=j;  // assign smallest index in smallestIndex 
//                       }    
//                  }
//                 int temp= Arr[smallestIndex];   /*it swap the index value to that smallest value on that index*/
//                 Arr[smallestIndex]=Arr[i];
//                 Arr[i]=temp;
//               }
            

//             for (int i=0; i<Arr.length; i++) {     //print output of this sorted array
//             System.out.print (" "+ Arr[i]); 
//             } 
//             System.out.println();

//         sc.close();
//          }
// }




