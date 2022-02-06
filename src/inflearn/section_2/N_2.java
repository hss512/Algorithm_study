package inflearn.section_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(solution(Integer.parseInt(br.readLine()), br.readLine()));
    }

    private static int solution(int count, String input) {

        StringTokenizer st = new StringTokenizer(input, " ");

        int[] intArray = new int[count];

        for (int i = 0; i < count; i++) {
            intArray[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = intArray[0], member = 1;


        for (int i = 0; i < count; i++) {
            if(i == count-1){
                break;
            }
            if(cnt < intArray[i+1]){
                member++;
                cnt = intArray[i+1];
            }
        }

        return member;
    }
}