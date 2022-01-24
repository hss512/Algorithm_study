package inflearn.section_1;

import java.io.*;

public class N_3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        bw.write(solution(input));
        bw.flush();
        bw.close();
    }

    private static String solution(String input) {

        StringBuilder sb = new StringBuilder();

        String[] s = input.split(" ");

        for (String token : s) {
            if(sb.length() < token.length()){
                sb.replace(0, token.length(), token);
            }
        }

        return sb.toString();
    }
}
