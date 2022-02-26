package inflearn.section_2;

import java.util.Scanner;

public class N_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] inputArr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                inputArr[i][j] = sc.nextInt();
            }
        }

        System.out.print(solution(m, n, inputArr));
    }

    private static int solution(int m, int n, int[][] inputArr) {

        int k = 0;

        for (int i = 0; i < n; i++) {
            int[] nArr = new int[n];
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if((i+1) == inputArr[j][l]){
                        for (int o = 0; o < l; o++) {
                            nArr[inputArr[j][o] - 1] = 1;
                        }
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                if(nArr[j] == 0) k++;
            }
        }

        return k-n;
    }
}
