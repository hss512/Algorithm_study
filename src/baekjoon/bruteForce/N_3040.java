import java.util.Scanner;

public class N_3040 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        
        int[] arr = new int[9];
        
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                int cnt = arr[i] + arr[j];
                if (sum - cnt == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j){
                            System.out.println(arr[k]);    
                        }
                    }
                }
            }
        }
    }
}
