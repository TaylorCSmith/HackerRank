import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()) {
            System.out.println(0);
            return;
        }
        String s = scan.nextLine();

        String delims = "[ !,?._'@]+";
        String[] tok = s.trim().split(delims);

        long tokLength = tok.length;
        System.out.println(tokLength); 
        
        for (int i = 0; i < tok.length; i++) {
            System.out.println(tok[i]); 
        }

        scan.close();
    }
}
