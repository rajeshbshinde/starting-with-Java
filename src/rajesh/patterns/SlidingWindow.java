package src.rajesh.patterns;

public class SlidingWindow {

    static int MaxSumOfKElements(int arr[],int k){
        int maxSum=0, maxindex=0;
        if(arr.length <k){
            return 0;
        }

        for(int i =0;i<k;i++){
            maxSum+=arr[i];
        }
        int windowSum=maxSum;
        for(int i=0;i<=(arr.length-k-1);i++){
            windowSum = windowSum - arr[i] + arr[i+k];
            if(windowSum > maxSum){
                maxSum = windowSum;
                maxindex = i+1;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {10,15,12,11,12,14,15,19};
        System.out.println("Largest sum of 2 elements is "+MaxSumOfKElements(arr,2));
        System.out.println("Largest sum of 4 elements is "+MaxSumOfKElements(arr,4));
    }
}
