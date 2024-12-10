package Progrmmers;

import java.security.Key;
import java.util.*;

public class Programmers42578 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        List<String> parts = new ArrayList<>();
        for (int i = 0; i < clothes.length; i++) {
            if (!parts.contains(clothes[i][1])) {
                parts.add(clothes[i][1]);
            }
        }
        Map<String, Integer> OOTD = new HashMap<>();
        int return1 = 0;
        for (int i = 0; i < clothes.length; i++) {
            if (OOTD.containsKey(clothes[i][1])) {
                OOTD.put(clothes[i][1], OOTD.get(clothes[i][1]) + 1);
            } else {
                OOTD.put(clothes[i][1], 1);
            }
        }
        for (int i =0;i<parts.size();i++)
            if (OOTD.size() == 1) {
                return1 = OOTD.get(clothes[i][1]);
            } else {
                return1 *= OOTD.get(parts.get(i));
            }

        System.out.println(return1);
    }
}
