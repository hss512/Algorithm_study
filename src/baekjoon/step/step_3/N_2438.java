package baekjoon.step.step_3;

import java.io.*;

public class N_2438 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String input = br.readLine();

            for (int i = 1; i <= Integer.parseInt(input); i++) {
                for (int j = 0; j < i; j++) {
                    bw.write("*");
                }
                bw.write("\n");
            }
            bw.flush();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
