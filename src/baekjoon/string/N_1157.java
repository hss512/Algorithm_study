package baekjoon.string;

import java.util.Scanner;

public class N_1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String st = input.toUpperCase();

        int max = -1;

        char result = '?';

        int[] array = new int[26];

        for (int i = 0; i < st.length(); i++) {

            char c = st.charAt(i);

            array[c - 65]++;
        }

        for (int i = 0; i < 26; i++) {
            if(array[i] > max){
                max = array[i];
                result = (char)(i + 65);
            }else if(array[i] == max){
                result = '?';
            }
        }

        System.out.println(result);
    }
}
