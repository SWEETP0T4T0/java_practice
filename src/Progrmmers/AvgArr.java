package Progrmmers;

public class AvgArr {
    public static void main(String[] args) {
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double answer =0;

        for (int i : numbers) {
            answer += i;
        } answer /= numbers.length;
        System.out.println(answer);
    }
}
