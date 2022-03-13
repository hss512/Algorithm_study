package inflearn.section_3;

import java.util.Scanner;

public class N_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {

        int sum = 0, p = 0, count = 0;

        for (int i = 0; i < n; i++) {
            p = i;
            sum = 0;
            while(p < n){
                sum += arr[p];
                if(sum == m){
                    count++;
                    break;
                }else if(sum > m) break;
                p++;
            }
        }

        return count;
    }
}

/*
내가 푼 알고리즘의 시간 복잡도는 o(n^2)
아래 풀이는 o(n)

public int solution(int n, int m, int[] arr){

    int answer = 0, sum = 0, lt = 0;

    for(int rt = 0; rt < n; rt++){
        sum += arr[rt];
        if(sum == m) count++;
        while(sum >= m){
            sum -= arr[lt++];
            if(sum == m) result++;
        }
    }
    return count;
}

*/
