package inflearn.section_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        System.out.print(solution(input));
    }

    private static String solution(String input) {

        String result = "YES";

        char[] s = input.toUpperCase().toCharArray();

        for (int i = 0; i < s.length; i++) {
            if (s[i] != s[s.length - i - 1]) {
                result = "NO";
                break;
            }
        }
        return result;
    }
}
