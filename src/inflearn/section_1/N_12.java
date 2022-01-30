package inflearn.section_1;

import java.io.*;

public class N_12 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(solution(Integer.parseInt(br.readLine()), br.readLine()));
    }

    private static String solution(int count, String input) {

        int cnt = 0;

        StringBuilder result = new StringBuilder();

        while(cnt != count){
            String s = input.substring(cnt * 7, (cnt + 1) * 7).replace('#', '1').replace('*', '0');
            int binary = Integer.parseInt(s, 2);
            result.append((char) binary);
            cnt++;
        }

        return result.toString();
    }
}
