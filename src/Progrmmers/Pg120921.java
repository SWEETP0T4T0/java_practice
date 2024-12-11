
package Progrmmers;

public class Pg120921 {
    public static void main(String[] args) {
        String A = "hello";
        String B = "ohell";
        String AA = A + A;
        int result = 0;

        for (int i = 0; i < AA.length() / 2; i++) {
            if (AA.substring(i, i + A.length()).equals(B)) {
                result = i;
            } else result = -1;
        }
        System.out.println(result);
    }
}



