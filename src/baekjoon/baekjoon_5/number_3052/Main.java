package baekjoon.baekjoon_5.number_3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int count = 0;

        try{
            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(br.readLine()) % 42;
                for (int j = i-1; j >= 0; j--) {
                    if(arr[j] == arr[i]){
                        arr[j] = -1;
                        break;
                    }
                }
            }

            for (int i : arr) {
                if(i >= 0){
                    count++;
                }
            }

            System.out.print(count);

            br.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
