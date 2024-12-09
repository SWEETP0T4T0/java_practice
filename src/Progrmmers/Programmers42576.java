package Progrmmers;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers42576 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        List<String> participant1 = new ArrayList<>(Arrays.asList(participant));
        List<String> completion1 = new ArrayList<>(Arrays.asList(completion));
        List<String> answer = new ArrayList<>();

        for (int i=0; i<participant1.size(); i++) {

            if (completion1.contains(participant1.get(i))) {
                completion1.remove(participant1.get(i));
                }
            else answer.add(participant1.get(i));
            }

        System.out.println(answer);


    }
}
