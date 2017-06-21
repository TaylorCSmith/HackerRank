import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> arrLists = new ArrayList<>(); 
        for (int i = 0; i < n; i++) {
            int c = scan.nextInt();
            ArrayList<Integer> arrList = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                arrList.add(scan.nextInt());
            }
            arrLists.add(arrList);
        }
        
        int query = scan.nextInt(); 
        for (int i = 0; i < query; i++) {
            int xCord = scan.nextInt();
            int yCord = scan.nextInt();
            ArrayList<Integer> queryRes = arrLists.get(xCord-1); 
            if (yCord <= queryRes.size()) {
                System.out.println(queryRes.get(yCord-1));
            } else { 
                System.out.println("ERROR!");
            }
        }
        scan.close(); 
    }
}