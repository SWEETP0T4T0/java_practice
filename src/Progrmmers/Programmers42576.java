package Progrmmers;

import java.util.*;

public class Programmers42576 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        Map<String, Integer> answer = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            answer.put(participant[i], answer.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            answer.put(completion[i], answer.getOrDefault(completion[i],1)-1);
        }
        for (String key : answer.keySet()) {
            if (answer.get(key) == 1) {
                System.out.println(key); // 출력: 완주하지 못한 선수
                break; // 단일 결과이므로 종료
            }
        }
        }
    }


//        List풀이 시간초과.
//        List<String> participant1 = new ArrayList<>(Arrays.asList(participant));
//        List<String> completion1 = new ArrayList<>(Arrays.asList(completion));
//        List<String> answer = new ArrayList<>();
//
//        for (int i=0; i<participant1.size(); i++) {
//
//            if (completion1.contains(participant1.get(i))) {
//                completion1.remove(participant1.get(i));
//                }
//            else answer.add(participant1.get(i));
//            }
//
//        System.out.println(answer);
//    }
//}