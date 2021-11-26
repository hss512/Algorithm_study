package baekjoon.baekjoon_4.number_1110;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int input = Integer.parseInt(br.readLine());
            int first = input/10;
            int second = input%10;
            int number = -1;
            int count = 0;

            while (number != input){
                count++;
                number = second * 10 + (first + second)%10;
                first = number/10;
                second = number%10;
            }
            System.out.println(count);

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
