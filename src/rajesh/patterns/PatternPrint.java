package src.rajesh.patterns;

import java.util.Arrays;
import java.util.Scanner;

public class PatternPrint {


    /**
     * Example as below,
     * Enter the lines for pattern:
     * 3
     * Should print below,
     * 1*2*3*10*11*12
     * -4*5*8*9
     * --6*7
     * @param a
     * @param N
     * @return
     */
    static int minCntFoun(int a[], int N) {

        int[] dp = new int[N + 1];
        Arrays.fill(dp, -1);

        // Mark the reachable indices for each fountain
        for (int i = 0; i < N; i++) {
            int left = Math.max(i - a[i], 0);
            int right = Math.min(i + a[i]+1, N);
            dp[left] = Math.max(dp[left], right);
        }

        int cntfount = 1;
        int idxRight = dp[0];
        int idxNext = 0;

        // Traverse the reachable indices and activate fountains
        for (int i = 0; i < N; i++) {

            idxNext=Math.max(idxNext,dp[i]);
            if(i==idxRight){
                cntfount++;
                idxRight = idxNext;
            }

        }

        return cntfount;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextLine());


//        int n = input.nextInt();
//        int[] location=new int[n];
//        for(int i=0;i < n;i++){
//            location[i]=input.nextInt();
//
//        }
//
//        System.out.print(minCntFoun(location, n));
        System.out.println("Enter the lines for pattern:");
        int n = input.nextInt();

        int limit = n*(n+1);
        int startLeft = 0;
        int startRight = limit;
        for(int i=0;i<n;i++){
            //print initiat -
            for(int j=0;j<i;j++){
                System.out.print("-");
            }
            // Right side numbers with increments
            for(int j =0;j<(n-i);j++){
                System.out.print((++startLeft)+"*");
            }
            startRight=startRight - (n-i);
            int right = startRight;

            // Left side numbers with increments
            for(int j =0;j<(n-i);j++){
                System.out.print((++right));
                if(j!=(n-(i+1))){
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}
