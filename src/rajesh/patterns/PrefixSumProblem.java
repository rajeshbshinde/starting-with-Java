package src.rajesh.patterns;

public class PrefixSumProblem {
    public static int subArraySum(int arr[],int i, int j){
        int prefixSumArray[] = prefixSumArray(arr);
        return prefixSumArray[j]-prefixSumArray[i-1];
    }
    public static int[] prefixSumArray(int arr[]){
        int prefixSumArray[]=new int[arr.length];
        prefixSumArray[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSumArray[i] = prefixSumArray[i-1]+arr[i];
        }
        return prefixSumArray;
    }

    public static void main(String[] args) {
        int arr[] = {10,2,11,13,7,4,7,3,1};
        System.out.println("Sum for 1,5 is "+subArraySum(arr,1,5));
        System.out.println("Sum for 1,3 is "+subArraySum(arr,1,3));
        System.out.println("Sum for 1,6 is "+subArraySum(arr,1,6));
    }
}
