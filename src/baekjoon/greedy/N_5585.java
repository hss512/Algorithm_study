package baekjoon.greedy;

import java.util.Scanner;
 
public class N_5585 {
    public static void main(String[] args) {
 
	Scanner sc = new Scanner(System.in);
 
  	int change = 1000 - sc.nextInt();
         
        int[] coins = {500, 100, 50, 10, 5, 1};

	int count = 0;
        
        for(int coin : coins){
            if(change >= coin){
                count += change / coin;
                change %= coin;
            }
        }
      
	System.out.print(count);
    }
}
