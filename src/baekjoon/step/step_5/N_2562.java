package baekjoon.step.step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2562 {
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
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
