package baekjoon.step.step_3;

import java.io.*;

public class N_2741 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String input = br.readLine();

            br.close();

            for (int i = 1; i <= Integer.parseInt(input); i++) {
                bw.write(i + "\n");
            }

            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
