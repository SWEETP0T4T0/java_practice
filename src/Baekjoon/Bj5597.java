    package Baekjoon;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.*;

    public class Bj5597 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = 28;
            Set<Integer> student = new TreeSet<>();
            int x = 0;
            int y = 0;
            for (int i = 0; i < N; i++) {
                int a = Integer.parseInt(br.readLine());
                student.add(a);
            }

            for (int i = 1; i < 31; i++) {
                if (!student.contains(i)){
                    if (x == 0) {
                        x=i;
                    }else  y=i;
                }
            }
            if (x > y) {
                System.out.println(y);
                System.out.print(x);
            }else {
                System.out.println(x);
                System.out.print(y);
            }

        }
    }
