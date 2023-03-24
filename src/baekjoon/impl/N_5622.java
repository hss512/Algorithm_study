package baekjoon.impl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        int count = 0, result = 0;
        
        int[] number = {3, 3, 3, 3, 3, 4, 3 ,4};
        
        int[] alp = new int[26];

        for(int i = 0; i < number.length; i++){
            for(int j = 0; j < number[i]; j++){
                alp[count] = i +2;
                count++;
            }
        }

        for(int i = 0; i < s.length(); i++){
            result += alp[s.charAt(i) - 65] + 1;
        }
        
        System.out.print(result);
    }
}

/* 
다른 풀이 switch-case

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
 
		int count = 0;
		int k = s.length();
        
		for(int i = 0; i < k; i++) {
        
			switch(s.charAt(i)) {
            
			case 'A' : case 'B': case 'C' : 
				count += 3;
				break;
                
			case 'D' : case 'E': case 'F' :
				count += 4; 
				break;
                
			case 'G' : case 'H': case 'I' :
				count += 5; 
				break;
                
			case 'J' : case 'K': case 'L' : 
				count += 6;
				break;
                
			case 'M' : case 'N': case 'O' :
				count += 7;
				break;
                
			case 'P' : case 'Q': case 'R' : case 'S' : 
				count += 8; 
				break;
                
			case 'T' : case 'U': case 'V' : 
				count += 9;
				break;
                
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				count += 10;
				break;
			}
		}		
		System.out.print(count);
	}
}
*/
