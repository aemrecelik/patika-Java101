package Pratikler;

import java.util.Scanner;

public class Pratik3 {

    public static void main(String[] args) {
        double x, a, b, c, cevre, alan;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Kenar Uzunluğunu giriniz : ");
        a = scanner.nextDouble();

        System.out.println("2. Kenar Uzunluğunu giriniz : ");
        b = scanner.nextDouble();

        System.out.println("3. Kenar Uzunluğunu giriniz : ");
        c = scanner.nextDouble();

        x = (a + b + c) / 2;
        cevre = 2 * x;
        alan = Math.sqrt(x * (x - a) * (x - b) * (x - c));

        System.out.println("1.Kenar : " + a);
        System.out.println("2.Kenar : " + b);
        System.out.println("3.Kenar : " + c);
        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı : " + alan);

    }
}
