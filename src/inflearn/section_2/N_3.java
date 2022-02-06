package inflearn.section_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        solution(br.readLine(), br.readLine(), br.readLine());
    }

    private static void solution(String inputN, String inputA, String inputB) {

        for (int i = 0; i < Integer.parseInt(inputN); i++) {
            switch((int)inputA.charAt(i*2) - (int)inputB.charAt(i*2)){
                case -2:
                case 1:
                    System.out.println("A");
                    break;
                case -1:
                case 2:
                    System.out.println("B");
                    break;
                case 0:
                    System.out.println("D");
                    break;
            }
        }
    }
}
