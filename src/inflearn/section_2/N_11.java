package inflearn.section_2;

import java.util.Scanner;

public class N_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr, n));
    }

    private static int solution(int[][] arr, int n) {

        int[] resultArr = new int[n];
        int cnt = 0, max =0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if(k == i) continue;
                    if(arr[i][j] == arr[k][j]){
                        resultArr[i]++;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if(resultArr[i] > max){
                max = resultArr[i];
                cnt = i;
            }
        }

        for (int i : resultArr) {
            System.out.println(i);
        }

        System.out.println("==========");
        return cnt+1;
    }
}
