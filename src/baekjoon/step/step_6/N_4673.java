package baekjoon.step.step_6;

public class N_4673 {
    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        for (int i = 1; i < check.length; i++) {
            int n = f(i);
            if(n < 10001){
                check[n] = true;
            }
        }

        for (int i = 1; i < check.length; i++) {
            if(!check[i]){
                System.out.println(i);
            }
        }
    }

    private static int f(int n) {

        int sum = n;

        while (n != 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
