package Pratikler;

import java.util.Scanner;

public class Pratik13 {

    public static void main(String[] args) {
        int toplam = 0, sayi;
        boolean tekSayiMi = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");

        while (tekSayiMi) {
            sayi = scanner.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Sayı çift, başka bir sayı giriniz");
                if (sayi % 4 == 0)
                    toplam += sayi;
            } else {
                tekSayiMi = false;
                System.out.println("Çift ve 4 e tam bölünenlerin toplamı:" + toplam);
            }
        }
    }
}
