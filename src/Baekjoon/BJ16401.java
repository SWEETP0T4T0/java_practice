package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ16401 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        String[] crr = br.readLine().split(" ");
        int m = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);

        int[] brr = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = Integer.parseInt(crr[i]);
        }
        int start = 0;
        int end = brr.length - 1;
        int count = 0;
        int mid = (end + start) / 2;
        for (int i = start; i <= end; i++) {
            count += (brr[i] / mid);
        }
        int b = count;

        while (count < m) {
            end = mid-1;
        }

    }
}

//        int[] brr = new int[n];
//        for (int i = 0; i < n; i++) {
//            brr[i] = Integer.parseInt(crr[i]);
//        }
//        Arrays.sort(brr);
//        int i = 1;
//        int count=0;
//        int[] drr = new int[brr[brr.length-1]+1];
//        while (i<brr[brr.length-1]){
//            for (int j = 0; j < brr.length; j++) {
//                if (brr[j] / i != 0) {
//                    count+= brr[j]/i;
//                }
//            }
//            drr[i]=count;
//            count = 0;
//            i++;
//        }
//        for (int j = 0; j < drr.length; j++) {
//            if (drr[j] == m) {
//                answer=j;
//            }
//        }
//        System.out.println(answer);
//    }
//}
