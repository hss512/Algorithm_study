package inflearn.section_1;

import java.io.*;
import java.util.Scanner;

public class N_11 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(solution(br.readLine().toCharArray()));
    }

    private static String solution(char[] input) {

        int cnt = 1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            if(i == input.length-1) {
                if(cnt == 1){
                    sb.append(input[i]);
                }else {
                    sb.append(input[i]).append(cnt);
                }
                break;
            }
            if(input[i] == input[i+1]){
                cnt++;
            }else{
                if(cnt == 1){
                    sb.append(input[i]);
                }else {
                    sb.append(input[i]).append(cnt);
                    cnt = 1;
                }
            }
        }
        return sb.toString();
    }
}

// 강사님 방식

/*
class N_11 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.print(solution(input));
    }

    private static String solution(String input) {

        int cnt = 1;
        input = input + " ";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length()-1; i++) {
            if(input.charAt(i) == input.charAt(i+1))
                cnt++;
            else{
                sb.append(input.charAt(i));
                if(cnt > 1){
                    sb.append(cnt);
                }
                cnt = 1;
            }
        }

        return sb.toString();
    }
}*/
