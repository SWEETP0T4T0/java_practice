package Progrmmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PG12913 {
    public static void main(String[] args) {
        int[][] land = {{1, 2, 3, 5}, {7,8,10,9}, {4, 3, 5, 1}};
        int answer = 0;

        Map<Integer, Integer> myMap = new HashMap<>();
        for (int j = 0; j < land.length; j++) {
            if (myMap.isEmpty()) {
                int a = 0;
                int b = Arrays.stream(land[0]).max().getAsInt();
                for (int i = 0; i < land[0].length; i++) {
                    if (land[0][i] == b) {
                        a = i;
                        break;
                    }
                }
                myMap.put(b, a);
            } else {
                int c = 0;
                for (Integer i : myMap.keySet()) {
                    c=i;
                }
                int a= 0;
                for (int i = 0; i < land[j].length; i++) {
                    int b = Arrays.stream(land[j]).max().getAsInt();
                    if (land[j][i] == b) {
                        a+=i;
                        break;
                    }
                }
                if (myMap.containsValue(a)) {
                    int[] copy = Arrays.stream(land[j]).toArray();
                    Arrays.sort(copy);
                    int b = copy[copy.length - 2];
                    for (int i = 0; i < land[j].length; i++) {
                        if (land[j][i] == b) {
                            a = i;
                        }
                    }
                    myMap.clear();
                    myMap.put(c+b, a);
                }else {
                    myMap.clear();
                    myMap.put(c+Arrays.stream(land[j]).max().getAsInt(), a);
                }
            }
        }
        for (Integer i : myMap.keySet()) {
            answer=i;
        }
        System.out.println(answer);
    }
}
