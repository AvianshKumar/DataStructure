package Array;

public class SecondLargestInArray {

    public static void main(String[] args)
    {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
    }
    static int print2largest(int arr[], int n) {
        // code here

        int maax=Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        if(arr.length<2){
            return -1;
        }
        // if(arr[0]>arr[1]){
        //     maax = arr[0];
        //     secondMax = arr[1];
        // }else{
        //     secondMax = arr[0];
        //     maax = arr[1];
        // }
        //maax = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maax){
                secondMax = maax;
                maax = arr[i];

            }else if(arr[i]>secondMax && arr[i]!=maax)
            {
                secondMax = arr[i];
            }

        }
        if(secondMax == Integer.MIN_VALUE){
            return -1;
        }else{
            return secondMax;
        }
    }
}
