import java.io.*;
import java.util.*;
import java.math.BigInteger; 

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();
        
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b)); 
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}