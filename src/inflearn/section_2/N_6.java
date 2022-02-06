package inflearn.section_2;

import java.util.Scanner;

public class N_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n, arr));
    }

    private static String solution(int input, int[] arr) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input; i++) {
            int tmp = arr[i];
            int num = 0;
            while(tmp > 0){
                int t = tmp % 10;
                num = num*10 + t;
                tmp = tmp/10;
            }
            if(isPrime(num)){
                sb.append(num).append(" ");
            }
        }
        return sb.toString();
    }

    private static boolean isPrime(int num) {
        if(num==1) return false;
        for (int i = 2; i < num; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
}
