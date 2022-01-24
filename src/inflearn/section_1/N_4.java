package inflearn.section_1;

import java.io.*;

public class N_4 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int inputCount = Integer.parseInt(br.readLine());

        solution(inputCount);
    }

    private static void solution(int inputCount)  throws IOException {

        StringBuilder sb = new StringBuilder();

        String[] result = new String[inputCount];

        for (int i = 0; i < inputCount; i++) {
            String inputString = br.readLine();
            result[i] = sb.append(inputString).reverse().toString();
            sb.delete(0, inputString.length());
        }

        for (String s : result) {
            bw.write(s+"\n");
            bw.flush();
        }

        bw.close();
    }
}
