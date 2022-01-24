package inflearn.section_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();
        char token = br.readLine().charAt(0);

        System.out.println(solution(string, token));
    }

    public static int solution(String string, char token) {

        int count = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.substring(i).toUpperCase().charAt(0) == token) {
                count++;
            } else if (string.substring(i).toLowerCase().charAt(0) == token) {
                count++;
            }
        }

        return count;
    }
}

/*
더 좋은 로직

public class N_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();
        char token = br.readLine().toUpperCase().charAt(0);

        System.out.println(solution(string, token));
    }

    public static int solution(String string, char token) {

        int count = 0;

        for (char x : string.toUpperCase().toCharArray()) {
            if(token == x) count++;
        }

        return count;
    }
}*/
