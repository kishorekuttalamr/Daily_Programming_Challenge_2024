public class Sort012{

    public static void main(String[] args){
        int[] arr = {0, 0, 0, 0};
        for(int num : arr)
            System.out.print(num + " ");

        sorter(arr);
        System.out.println();

        for(int num : arr)
            System.out.print(num + " ");
    }
    public static void sorter(int[] arr){
        int p0 = 0,p = 0;
        int p2 = arr.length - 1;
        while(p<=p2){
            if(arr[p]==0){
                int temp = arr[p0];
                arr[p0] = arr[p];
                arr[p] = temp;
                p++;
                p0++;
            }
            else if(arr[p]==2){
                int temp = arr[p2];
                arr[p2] = arr[p];
                arr[p] = temp;
                p2--;
            }
            else{
                p++;
            }
        }
    }
}