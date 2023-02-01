package baekjoon.math;

import java.util.Scanner;
 
public class N_10039 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int sum = 0 ;
    
		for(int i = 0; i < 5; i++) {
        
			int score = in.nextInt();
			
      if(score > 40){
        sum += score;
      }else{
        sum += 40;
      }
		}
    
		System.out.println(sum/5);
	}
 
}
