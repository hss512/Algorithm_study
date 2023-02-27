import java.math.BigInteger;
import java.util.Scanner;

public class N_2935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger A = new BigInteger(sc.nextLine());
        
        char c = sc.nextLine().charAt(0);
        
        BigInteger B = new BigInteger(sc.nextLine());
	
        if(c == '*'){
            System.out.println(A.multiply(B));   
        }else{
            System.out.println(A.add(B));            
        }
    }
}
