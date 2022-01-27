package inflearn.section_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_8 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        System.out.print(solution(input));
    }

    private static String solution(String input) {

        String result = "YES";

        char[] s = input.toUpperCase().toCharArray();

        int lt = 0, rt = s.length-1;

        while (lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                if(s[lt] != s[rt]){
                    result = "NO";
                    break;
                }
                lt++;
                rt--;
            }
        }

        return result;
    }
}
