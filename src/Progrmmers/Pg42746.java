package Progrmmers;


import java.util.Comparator;
import java.util.PriorityQueue;

public class Pg42746 {
    public static void main(String[] args) {

//        앞자리만 비교해서 스트링빌더로 받고 그대로 출력하기도 가능할듯

        int[] numbers = {3, 30, 34, 5, 9};
        String answer = "";

        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        for (int i = 0; i < numbers.length; i++) {
            pq.add(Integer.toString(numbers[i]));
        }

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            sb.append(pq.poll());
        }

        String result = sb.toString();
        if (result.startsWith("0")) {
            result = "0";
        }

        System.out.println(pq);




    }
}
