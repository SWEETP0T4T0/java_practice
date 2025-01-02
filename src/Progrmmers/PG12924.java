package Progrmmers;


import java.util.ArrayList;
import java.util.List;

public class PG12924 {
    public static void main(String[] args) {
        int n =15;

        int[] myArr = new int[n];
        for (int i = 0; i < n; i++) {
            myArr[i]=i+1;
        }

        int left = 0;
        int right = 0;
        int x = myArr[0];
        List<int[]> answer = new ArrayList<>();

        while (left <= right && right < myArr.length) {
            if (x == n) {
                answer.add(new int[]{myArr[left], myArr[right]});
                x -= myArr[left];
                left++;
            } else if (x > n) {
                x -= myArr[left];
                left++;
            } else if (x < n) {
                if (right < myArr.length - 1) {
                    right++;
                    x += myArr[right];
                } else {
                    right++;
                }
            }
        }
        System.out.println(answer.size());
    }
}
//        answer.sort(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return (o2[1] - o2[0]) - (o1[1] - o1[0]);
//            }
//        });
