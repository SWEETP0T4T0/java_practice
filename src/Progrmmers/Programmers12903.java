package Progrmmers;

public class Programmers12903 {
    public static void main(String[] args) {
        String s = "abcde";
        String answer = "";
        if (s.length() % 2 == 0) {
            int a = s.length() / 2;
            int b = (s.length() / 2) +2;
            answer += s.substring(a,b+1);
        } else {
            int a = s.length() / 2;
            answer = s.substring(a,a+1);
        }
        System.out.println(answer);
    }
}
