package baekjoon.string;

import java.util.Scanner;

public class N_1159 {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int[] arr = new int[26];
    
    int check = 0;
    
    int N = sc.nextInt();
    
    for(int i = 0; i < N; i++){
      String name = sc.next();
      char c = name.charAt(0);
      arr[c - 97]++;
    }
    
    for(int i = 0; i < arr.length; i++){
      if(arr[i] >= 5){
        check = 1;
        System.out.print((char)(i+97));
      }
    }
    
    if(check == 0){
      System.out.println("PREDAJA");
    }
  }
}
