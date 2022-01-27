package inflearn.section_1;

import java.io.*;

public class N_9 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(solution(br.readLine()));
    }

    private static int solution(String input) {

        char[] s = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(char c : s){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
