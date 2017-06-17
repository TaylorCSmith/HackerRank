import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        
        for (int counter = 1; text != null; counter++) {
            System.out.printf("%d %s \n", counter, text);
            text = scan.nextLine();
        }
    }   
}