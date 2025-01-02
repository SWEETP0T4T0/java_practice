package Progrmmers;

public class PG42862 {
    public static void main(String[] args) {

        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        int answer = 0;

        int[] total = new int[n];
        for (int i : lost) {
            total[i-1] -= 1;
        }
        for (int i : reserve) {
            total[i - 1] += 1;
        }
        for (int i = 0; i < total.length; i++) {
            if (total[i] == -1) {
                if (i != 0 && total[i - 1] == 1) {
                    total[i] += 1;
                    total[i - 1] -= 1;
                }
                else if (i != total.length-1 && total[i + 1] == 1) {
                    total[i] += 1;
                    total[i + 1] -= 1;
                }
            }
        }
        for (int i : total) {
            if (i >= 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}