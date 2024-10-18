// import java.util.Scanner;

//  public class  Solution{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
            
//             // System.out.print("Please enter a number: ");
//             // int A = sc.nextInt(); 

//             String[] strs = {"flower","flow","flight"};
//             String[] strs2 = {"dog","racecar","car"};

            



//         sc.close();
//     }
// }











// Algo Used: Sorting, Two Pointer Approach
// TC: O(NlogN), SC: O(1) (excluding the output string)

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length; // Pehle string array ka length nikal rahe hain
        
        // Arrays.sort(strs) ka matlab hai string array ko sort karna
        // Sorting ke baad hume sirf pehli aur aakhri string ko compare karna padega
        // Kyunki sorted sequence ke according, first aur last string mein hi common prefix hoga
        Arrays.sort(strs); 
        
        // First aur last sorted string ko variables mein store kar rahe hain
        String first = strs[0]; // Pehli string
        String last = strs[n-1]; // Aakhri string
        
        // StringBuilder ka use karenge common prefix ko store karne ke liye
        StringBuilder ans = new StringBuilder();
        
        // First aur last string ke minimum length tak loop chalega, kyunki common prefix sirf utne hi characters tak hoga
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            // Agar first aur last string ke kisi bhi character par mismatch hota hai, to loop ko turant rok denge
            if (first.charAt(i) != last.charAt(i)) {
                // Agar characters match nahi karte, to ab tak jo ans build kiya hai, usko return kar denge
                return ans.toString();
            }
            // Agar characters match karte hain, to us character ko ans mein add karte jaenge
            ans.append(first.charAt(i));
        }
        
        // Loop ke baad jo bhi common prefix mila, usko return kar denge
        return ans.toString();
    }
}
