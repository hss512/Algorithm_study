package baekjoon.math;

import java.util.Scanner;

public class N_2476{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
        
		int max = 0;
        
		for(int i=0; i<N; i++){
		    int x = sc.nextInt();
            
			  int y = sc.nextInt();
            
			  int z = sc.nextInt();
            
        int sum = 0;
			
			  if(x == y && x == z && y == z)
			      sum = 10000 + x*1000;
			  else if(x == y || x == z)
  				  sum = 1000 + x*100;
	  		else if(y == z)
  				  sum = 1000 + y*100;
	  		else {
            sum =Math.max(x, Math.max(y, z)) * 100;
	  		}
        if(max < sum){
            max = sum;
        }
		}
		System.out.print(max);
	  }
}
