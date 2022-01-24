package inflearn.section_1;

import java.io.*;

public class N_5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(br.readLine()));
        bw.flush();
        bw.close();
    }

    private static String solution(String input) {

        char[] s = input.toCharArray();

        int lt = 0, rt = s.length-1;

        while (lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : s) {
            sb.append(c);
        }

        return sb.toString();
    }
}