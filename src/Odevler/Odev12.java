package Odevler;

import java.util.Scanner;

public class Odev12 {
    static boolean isPrime(int n, int i) {

        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;


        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bir sayı giriniz:");
            sayi = scanner.nextInt();
            if (isPrime(sayi, 2)) {
                System.out.println("Sayı asaldır.");
            } else
                System.out.println("Sayı asal değildir.");
        }
    }
}
