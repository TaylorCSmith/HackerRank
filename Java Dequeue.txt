    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> hSet = new HashSet<>(); 
            
            int n = scan.nextInt();
            int m = scan.nextInt();
            int max = Integer.MIN_VALUE; 
            
            for(int i = 0; i < n; i++) { 
                int in = scan.nextInt(); 
                
                deque.add(in);
                hSet.add(in); 
                
                if(deque.size() == m) {
                    if(hSet.size() > max)
                        max = hSet.size(); 
                    int first = deque.remove(); 
                    if(!deque.contains(first))
                        hSet.remove(first);    
                }
            }
            System.out.println(max); 
        }
    }