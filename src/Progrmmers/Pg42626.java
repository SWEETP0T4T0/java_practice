package Progrmmers;

import java.util.PriorityQueue;
import java.util.Queue;

public class Pg42626 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;
        Queue<Integer> taste = new PriorityQueue<>();

        for (int i=0; i<scoville.length; i++) {
            taste.add(scoville[i]);
        }


        while (taste.peek()<K){
            if (taste.size() <= 1) {
                count = -1;
                break;
            } else {
                a= taste.poll();
                b= taste.poll();
                c= a+(b*2);
                taste.add(c);
                count ++;
            }


    } System.out.println(count);
}
}
