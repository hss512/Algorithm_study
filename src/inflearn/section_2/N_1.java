package inflearn.section_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(solution(Integer.parseInt(br.readLine()), br.readLine()));

    }

    private static String solution(int count, String input) {

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(input, " ");

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < result.length; i++) {
            if(i == 0){
                sb.append(result[i]).append(" ");
                continue;
            }
            if(result[i] > result[i-1]){
                sb.append(result[i]).append(" ");
            }
        }

        return sb.toString();
    }
}
