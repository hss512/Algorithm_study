package baekjoon.step.step_3;

import java.io.*;
import java.util.StringTokenizer;

public class N_15552 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;

        try {

            String t = br.readLine();

            StringTokenizer st = new StringTokenizer(t);
            Integer.parseInt(st.nextToken());

            for (int i = 0; i < Integer.parseInt(t); i++) {

                String[] a_b = br.readLine().split(" ");

                for (String s : a_b) {
                    sum += Integer.parseInt(s);
                }

                bw.write(sum+"\n");

                sum = 0;
            }

            br.close();

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
