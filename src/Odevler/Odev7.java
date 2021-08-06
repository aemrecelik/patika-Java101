package Odevler;

import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {
        int sayi, toplam , i = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            toplam=0;
            i=1;
            System.out.println("Bir sayı giriniz.");
            sayi = scanner.nextInt();
            while (sayi > i) {
                if (sayi % i == 0) {
                    toplam += i;
                }

                i++;
            }

            if (sayi == toplam)
                System.out.println("Mükkemmel sayıdır");
            else
                System.out.println("Mükemmel sayı değildir.");
        } while (sayi != -1);
    }
}
