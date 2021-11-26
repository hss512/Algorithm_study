package baekjoon.baekjoon_5.number_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{

            double[] arr = new double[Integer.parseInt(br.readLine())];

            String score = br.readLine();
            StringTokenizer st = new StringTokenizer(score);
            double highScore = 0;
            double newScore = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Double.parseDouble(st.nextToken());
                if(arr[i] > highScore) {
                    highScore = arr[i];
                }
            }

            for (int i = 0; i < arr.length; i++) {
                newScore += (arr[i] / highScore) * 100;
            }

            System.out.println(newScore/arr.length);

            br.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
