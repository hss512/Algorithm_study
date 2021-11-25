package baekjoon.baekjoon_5.number_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[9];

        int max = 0;

        int index = -1;

        try {
            for (int i = 0; i < 9; i++) {
                 arr[i] = Integer.parseInt(br.readLine());
                if(max < arr[i]){
                    max = arr[i];
                    index = i;
                }
            }
            System.out.println(max);
            System.out.println(index+1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
