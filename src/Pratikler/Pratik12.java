package Pratikler;

import java.util.Scanner;

public class Pratik12 {

    public static void main(String[] args) {
        int girilenSayi;
        int kacSayiVar = 0;
        int toplam = 0;
        double ortalama;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        girilenSayi = scanner.nextInt();
        for (int i = 0; i < girilenSayi; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                kacSayiVar++;
            }
        }

        ortalama = toplam / kacSayiVar;
        System.out.println("3 ve 4 e bölünen sayıların ortalaması : "+ortalama);
    }
}
