package baekjoon.baekjoon_5.number_2557;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            int C = Integer.parseInt(br.readLine());

            int result = A * B * C;

            int[] arr = new int[10];

            for (int i = 0; i <= 9; i++) {

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
