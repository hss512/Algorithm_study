package inflearn.section_3;

import java.util.*;

public class N_2 {

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

        for (Integer result : solution(n, nArr, m, mArr)) {
            System.out.print(result + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int[] a, int m, int[] b) {

        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while(p1<n && p2<m){
            if(a[p1] == b[p2]){
                result.add(a[p1++]);
                p2++;
            }
            else if(a[p1] < b[p2]) p1++;
            else p2++;
        }
        return result;
    }
}

// 내 solution

/*
private static ArrayList<Integer> solution(int n, int[] nArr, int m, int[] mArr) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(nArr[i] == mArr[j]){
                    if(result.contains(nArr[i]) && result.contains(mArr[j])) break;
                    result.add(nArr[i]);
                }
            }
        }
        Collections.sort(result);

        return result;
    }
 */