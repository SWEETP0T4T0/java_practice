package Baekjoon;

import java.util.Scanner;

public class Bj2754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        double b = 0;

        switch (a) {
            case "A+":
                b = 4.3;
                break;
            case "A0":
                b = 4.0;
                break;
            case "A-":
                b = 3.7;
                break;
            case "B+":
                b = 3.3;
                break;
            case "B0":
                b = 3.0;
                break;
            case "B-":
                b = 2.7;
                break;
            case "C+":
                b = 2.3;
                break;
            case "C0":
                b = 2.0;
                break;
            case "C-":
                b = 1.7;
                break;
            case "D+":
                b = 1.3;
                break;
            case "D0":
                b = 1.0;
                break;
            case "D-":
                b = 0.7;
                break;
            case "F":
                b = 0.0;
                break;
        }
        System.out.println(b);
    }
}
