package inflearn.section_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_11 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(solution(br.readLine().toCharArray()));
    }

    private static String solution(char[] input) {

        int[] count = new int[input.length];
        char[] charArray = new char[input.length];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if(input[i] == input[j]){
                    count[i]++;
                }else{
                    i = j-1;
                    break;
                }
                charArray[i] = input[i];
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            if(Character.isAlphabetic(charArray[i])){
                sb.append(charArray[i]);
            }
            if(count[i]>1){
                sb.append(count[i]);
            }
        }

        for (char value : charArray) {
            System.out.print(value);
        }
        System.out.println();
        for (int num : count) {
            System.out.print(num);
        }

        System.out.println();
        return sb.toString();
    }
}
