package inflearn.section_2;

import java.util.Arrays;
import java.util.Scanner;

public class N_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, arr);
    }

    private static void solution(int n, int[] arr) {

        int[] resultArr = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if(arr[i] < arr[j]){
                    cnt++;
                }
                resultArr[i] = cnt;
            }
        }
        for (int result : resultArr) {
            System.out.print(result + " ");
        }
    }
}
