import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int product = 0;
        for (int i = 1; i < 11; i++) {
            product = k*i;
            System.out.printf("%d x %d = %d \n", k, i, product);
        }
    }
}