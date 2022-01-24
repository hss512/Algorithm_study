package baekjoon.step.step_3;

import java.io.*;
import java.util.StringTokenizer;

public class N_11021 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String inputT = br.readLine();

            for (int i = 1; i <= Integer.parseInt(inputT); i++) {
                String input = br.readLine();
                StringTokenizer st = new StringTokenizer(input);

                bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");

                bw.flush();

            }

            br.close();
            bw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
