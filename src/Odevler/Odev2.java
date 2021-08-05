package Odevler;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        final double armut = 2.14, domates = 1.11, elma = 3.67, muz = 0.95, patlican = 5.0;
        double toplamFiyat;
        double kgElma, kgArmut, kgMuz, kgDomates, kgPatlican;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? : ");
        kgArmut=scanner.nextDouble();

        System.out.println("Elma Kaç Kilo ? : ");
        kgElma=scanner.nextDouble();

        System.out.println("Muz Kaç Kilo ? : ");
        kgMuz=scanner.nextDouble();

        System.out.println("Domates Kaç Kilo ? : ");
        kgDomates=scanner.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? : ");
        kgPatlican=scanner.nextDouble();

        toplamFiyat=(kgArmut*armut)+(kgDomates*domates)+(kgElma*elma)+(kgMuz*muz)+(kgPatlican*patlican);
        System.out.println("Toplam Tutar: " + toplamFiyat + "TL");

    }
}
