package inflearn.section_3;

import java.util.Scanner;

public class N_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {

        int result = 0;

        for (int i = 0; i < k; i++) {
            result += arr[i];
        }

        int sum = result;

        for (int i = k; i <n; i++) {
            sum += (arr[i] - arr[i-k]);
            result = Math.max(result, sum);
        }

        return result;
    }
}
