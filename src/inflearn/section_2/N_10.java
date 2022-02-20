package inflearn.section_2;

import java.util.Scanner;

public class N_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 2;
        int[][] intArray = new int[n][n];
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                intArray[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(intArray, n));
    }

    private static int solution(int[][] intArray, int n) {

        int result = 0;

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if( (intArray[i][j] > intArray[i-1][j]) && (intArray[i][j] > intArray[i+1][j]) && (intArray[i][j] > intArray[i][j+1]) && (intArray[i][j] > intArray[i][j-1])) {
                    result++;
                }
            }
        }

        return result;
    }
}

// 강사님 풀이 && 살짝 변경


/*
public class N_10 {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int[][] intArray, int n) {

        int result = 0;

        for(int i = 1; i < n - 1; i++){
            for (int j = 1; j < n - 1; j++) {
                boolean flag = true;
                for(int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(intArray[nx][ny] >= intArray[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N_10 T = new N_10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 2;
        int[][] intArray = new int[n][n];
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                intArray[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(intArray, n));
    }
}*/