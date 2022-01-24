package inflearn.section_1;

import java.io.*;

public class N_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine();

        bw.write(solution(inputString).toString());
        bw.flush();
        bw.close();
    }

    private static StringBuilder solution(String inputString) {

        StringBuilder result = new StringBuilder();

        for (char inputChar : inputString.toCharArray()) {
            if(Character.isLowerCase(inputChar)){
                result.append(Character.toUpperCase(inputChar));
            }else{
                result.append(Character.toLowerCase(inputChar));
            }
        }

        return result;
    }
}
