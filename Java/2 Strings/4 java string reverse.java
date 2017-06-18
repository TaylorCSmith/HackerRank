import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        System.out.println(isPalind(A));
    }
    
    static String isPalind(String str) {
        int l = str.length();
        for (int i = 0; i < l/2; i++) 
            if (str.charAt(i) != str.charAt(l-i-1)) 
                return "No";          
        return "Yes"; 
        }
}
