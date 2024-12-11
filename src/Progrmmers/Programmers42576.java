package Progrmmers;

import java.util.*;

public class Programmers42576 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer ="";

        int i = 0;
        for (; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                break;
            }

        }
        System.out.println(participant[i]);
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