import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int l = scan.nextInt();
        scan.close(); 
        
        String[] subStringArray = new String[word.length()-l+1];
        String subString = "";
        
        for (int i = 0; i < (word.length()-l+1); i++) {
            subString = word.substring(i, i+l);
            subStringArray[i] = subString;
        }        

        Arrays.sort(subStringArray);
        System.out.println(subStringArray[0]);
        System.out.println(subStringArray[subStringArray.length - 1]);
    }
}