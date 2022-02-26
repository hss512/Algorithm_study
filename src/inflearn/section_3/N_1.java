package inflearn.section_3;

import java.util.Scanner;

public class N_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }

        System.out.println(solution(n, nArr, m, mArr));
    }

    private static String solution(int n, int[] nArr, int m, int[] mArr) {

        StringBuilder sb = new StringBuilder();

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m){
            if(nArr[p1] < mArr[p2]){
                sb.append(nArr[p1++]).append(" ");
            }else {
                sb.append(mArr[p2++]).append(" ");
            }
        }

        while (p1<n){
            sb.append(nArr[p1++]).append(" ");
        }

        while (p2<m){
            sb.append(mArr[p2++]).append(" ");
        }

        return sb.toString();
    }
}
