import java.util.*;
public class DuplicateNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = (n*(n-1))/2;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int diff = sum - s;
        System.out.println("diff: " + diff);
    }
    
}
