package baekjoon.string;

import java.util.Scanner;

public class N_10820 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
 
        while (sc.hasNextLine()) {
 
            String s = sc.nextLine();
            
            int[] arr = new int[4];
 
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    arr[0] += 1;
                }else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    arr[1] += 1;
                }else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    arr[2] += 1;
                }else if (s.charAt(i) == ' ') {
                    arr[3] += 1;
                }
            } 
            
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            
            System.out.println("");
        }
    }
}
