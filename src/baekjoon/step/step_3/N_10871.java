package baekjoon.step.step_3;

import java.io.*;
import java.util.StringTokenizer;

public class N_10871 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {

            String inputFirst = br.readLine();
            String inputSecond = br.readLine();
            StringTokenizer st1 = new StringTokenizer(inputFirst);
            StringTokenizer st2 = new StringTokenizer(inputSecond);
            int n = Integer.parseInt(st1.nextToken());
            int x = Integer.parseInt(st1.nextToken());
            
            int [] seq = new int[n];

            for (int i = 0; i < n; i++) {
                seq[i] = Integer.parseInt(st2.nextToken());
            }

            for (int result : seq) {
                if(result<x) {
                    bw.write(result + " ");
                }
            }

            bw.flush();
            bw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
