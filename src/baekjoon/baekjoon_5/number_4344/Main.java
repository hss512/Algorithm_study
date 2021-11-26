package baekjoon.baekjoon_5.number_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {

            double score = 0; double cnt = 0;

            String[] scoreArray = br.readLine().split(" ");

            for (int j = 1; j < scoreArray.length; j++) {

                score += Double.parseDouble(scoreArray[j]);

            }

            for (int k = 1; k < scoreArray.length; k++) {

                if (Double.parseDouble(scoreArray[k]) > score/(scoreArray.length-1)){
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n", (cnt/((double)(scoreArray.length-1))) * 100);
        }
        br.close();
    }
}
