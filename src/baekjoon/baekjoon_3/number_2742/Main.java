package baekjoon.baekjoon_3.number_2742;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String input = br.readLine();

            br.close();

            for (int i = Integer.parseInt(input); i > 0; i--) {
                bw.write(i + "\n");
            }

            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}