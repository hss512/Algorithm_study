package inflearn.section_1;

import java.io.*;

// 내 풀이
public class N_6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = br.readLine().toCharArray();

        bw.write(solution(input));
        bw.flush();
        bw.close();
    }

    private static String solution(char[] input) {

        for (int i = 0; i < input.length-1; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(Character.isAlphabetic(input[i])) {
                    if (input[i] == input[j]) {
                        input[j] = '#';
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : input) {
            if(Character.isAlphabetic(c)){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}



/*  강사님 풀이
package section_1;

import java.io.*;

public class N_6 {

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

        for (int i = 0; i < input.length(); i++) {
            if(input.indexOf(input.charAt(i)) == i){
                sb.append(input.charAt(i));
            }
        }

        return sb.toString();
    }
}
*/
