package Progrmmers;


public class PG12914 {
    public static void main(String[] args) {
        int n = 4;
        long answer = 0;

        int[] jump = new int[n + 1];
        jump[0] = 1;
        jump[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            jump[i] = (jump[i - 1])%1234567 + (jump[i - 2])%1234567;
        }
        answer = jump[n]%1234567;
        System.out.println(answer);
    }
}

