import java.util.*;
public class MissNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        for(int i = 0; i < n-1; i++){
            arr[i] = sc.nextInt();
        }
        int miss = findMissingNo(arr, n);
        System.out.println(miss);
    }

    public static int findMissingNo(int arr[], int n){
        int sum = (n * (n + 1)) / 2;
        for(int i = 0; i < arr.length; i++){
            sum -= arr[i];
        }
        return sum;
    }
}
