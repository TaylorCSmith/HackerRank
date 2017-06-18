import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int sum = (A.length() + B.length());         
        System.out.println(sum); 
        
        if (A.compareTo(B) <= 0) {
            System.out.println("No"); 
        } else {
            System.out.println("Yes");
        }
        
        String ACap = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        String BCap = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
        
        System.out.printf("%s %s", ACap, BCap);
    }
}