package baekjoon.step.step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_8958 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try{
            String[] arr = new String[Integer.parseInt(br.readLine())];

            for (int i = 0; i < arr.length; i++) {
                String input = br.readLine();
                int score = 0, cnt = 0;
                for (int j = 0; j < input.length(); j++) {
                    if(input.charAt(j) == 'O'){
                        cnt++;
                        score += cnt;
                    }else{
                        cnt = 0;
                    }
                }
                sb.append(score).append("\n");
            }

            System.out.println(sb);

            br.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
