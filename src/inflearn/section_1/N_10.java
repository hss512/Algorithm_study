package inflearn.section_1;

import java.util.Scanner;

public class N_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        for(int x : solution(s,t)){
            System.out.print(x + " ");
        }
    }

    private static int[] solution(String s, char t) {

        int[] result = new int[s.length()];

        int p = 100;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t){
                p = 0;
            }else{
                p++;
            }
            result[i] = p;
        }

        p = 100;

        for (int i = s.length()-1; i >= 0 ; i--) {
            if(s.charAt(i) == t){
                p = 0;
            }else{
                p++;
                result[i] = Math.min(result[i], p);
            }
        }
        return result;
    }
}
