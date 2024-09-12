import java.util.Arrays;

public class InPlaceMerge {

    public static void mergeInPlace(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        
        int i = m - 1;
        int j = 0;    
        
        while (i >= 0 && j < n) {
            if (arr1[i] > arr2[j]) {
                
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        
        mergeInPlace(arr1, arr2);
        
        System.out.println("Array 1: " + Arrays.toString(arr1));  
        System.out.println("Array 2: " + Arrays.toString(arr2));  

        int[] arr1_2 = {10, 12, 14};
        int[] arr2_2 = {1, 3, 5};
        
        mergeInPlace(arr1_2, arr2_2);
        
        System.out.println("Array 1: " + Arrays.toString(arr1_2));  
        System.out.println("Array 2: " + Arrays.toString(arr2_2));  
    }
}
