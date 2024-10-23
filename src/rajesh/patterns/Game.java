package src.rajesh.patterns;

import java.util.Scanner;

public class Game {

    public static boolean canWin(int leap, int[] game) {
        int len = game.length;
        boolean isWin=false;
        int n = len - leap, i=1;
        for(;i<=n;i++){
            if(game[i-1]==0){
                continue;
            }else{
                break;
            }
        }
        // Return true if you can win the game; otherwise, return false.
        return (i-1)==n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
