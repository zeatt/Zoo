package maths;

import java.util.Scanner;

public class MathsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if ((x % 4 == 0)&&(x % 100 != 0)&&(x % 400 == 0)) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }
}
