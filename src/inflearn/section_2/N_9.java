package inflearn.section_2;

import java.util.Scanner;

public class N_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[][] intArray = new int[count][count];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                intArray[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(intArray, count));
    }

    private static int solution(int[][] intArray, int count) {

        int result = 0;

        for (int i = 0; i < count; i++) {
            int max_1 = 0, max_2 = 0;
            for (int j = 0; j < count; j++) {
                max_1 += intArray[i][j];
                max_2 += intArray[j][i];
            }
            result = Math.max(result, max_1);
            result = Math.max(result, max_2);
        }

        int max_1 = 0, max_2 = 0;
        for (int i = 0; i < count; i++) {
            max_1 += intArray[i][i];
            max_2 += intArray[i][count-1-i];
        }
        result = Math.max(result, max_1);
        result = Math.max(result, max_2);

        return result;
    }
}
