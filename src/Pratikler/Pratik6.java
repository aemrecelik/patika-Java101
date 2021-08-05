package Pratikler;

import java.util.Scanner;

public class Pratik6 {
    public static void main(String[] args) {
        int secim;
        double sayi1, sayi2, sonuc;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Sayıyı giriniz: ");
        sayi1 = scanner.nextDouble();
        System.out.println("2. Sayıyı giriniz: ");
        sayi2 = scanner.nextDouble();
        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        secim = scanner.nextInt();

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc = sayi1 / sayi2;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("Yanlış Seçimde Bulundunuz.");
                break;
        }


    }
}
