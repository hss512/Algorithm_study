package baekjoon.baekjoon_3.number_11022;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String inputT = br.readLine();

            for (int i = 1; i <= Integer.parseInt(inputT); i++) {
                String input = br.readLine();
                StringTokenizer st = new StringTokenizer(input);
                String a = st.nextToken();
                String b = st.nextToken();

                bw.write("Case #" + i + ": " + a + " + " + b + " = " + (Integer.parseInt(a) + Integer.parseInt(b)) + "\n");

                bw.flush();

            }

            br.close();
            bw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
