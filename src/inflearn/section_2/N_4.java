package inflearn.section_2;

import java.util.Scanner;

public class N_4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }

    private static String solution(int input) {

        int[] intArray = new int[input];
        intArray[0] = 1;
        intArray[1] = 1;
        StringBuilder sb = new StringBuilder("1 1 ");
        for (int i = 2; i < input; i++) {
            intArray[i] += intArray[i-1] + intArray[i-2];
            sb.append(intArray[i]).append(" ");
        }

        return sb.toString();
    }
}
