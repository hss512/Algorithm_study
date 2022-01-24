package baekjoon.step.step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2557 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int input = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

            String str = String.valueOf(input);

            int[] arr = new int[10];

            for (int i = 0; i < str.length(); i++) {
                arr[(str.charAt(i) - '0')]++;
            }

            for (int result : arr) {
                System.out.println(result);
            }

            br.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
