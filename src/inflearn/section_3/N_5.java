package inflearn.section_3;

import java.util.Scanner;

public class N_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    private static int solution(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        int count = 0, sum = 0, lt = 0;

        for(int rt = 0; rt < n; rt++){
            sum += arr[rt];
            if(sum == n) count++;
            while(sum >= n){
                sum -= arr[lt++];
                if(sum == n) count++;
            }
        }
        return count - 1;
    }
}
