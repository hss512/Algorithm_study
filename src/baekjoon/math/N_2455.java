package baekjoon.math;

import java.util.Scanner;

public class N_2455  {
 
	public static void main(String[] args) {

	 	Scanner sc = new Scanner(System.in);

		int cnt = 0, max = 0;		

		for(int i = 0; i <4; i++){
			int out = sc.nextInt();
			int in = sc.nextInt();
			cnt -= out;
			cnt += in;
			if(cnt > max){
				max = cnt;
			}
		}
		System.out.println(max);	
	}
}
