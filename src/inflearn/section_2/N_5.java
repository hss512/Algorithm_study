package inflearn.section_2;

import java.util.Scanner;

public class N_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(solution(sc.nextInt()));
    }

    private static int solution(int input) {

        int result = 0;

        int[] array = new int[input + 1];

        for (int i = 2; i < input; i++) {
            if(array[i] == 0){
                result++;
                for (int j = i; j < input; j+=i) {
                    array[j]++;
                }
            }
        }

        return result;
    }
}
