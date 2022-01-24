package baekjoon.step.step_4;

import java.io.*;
import java.util.StringTokenizer;

public class N_10925 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            try {
                String input = br.readLine();
                StringTokenizer st = new StringTokenizer(input);

                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                if(A == 0 && B == 0) {
                    bw.close();
                    br.close();
                    break;
                }else{
                    bw.write(A + B + "\n");
                    bw.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
