package Pratikler;

import java.util.Scanner;

public class Prartik11 {

    public static void main(String[] args) {
        int gun, ay;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hangi ayda doğdunuz: \n1-Ocak\n2-Şubat\n3-Mart\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos\n9-Eylül\n10-Ekim\n11-Kasım\n12-Aralık");
        ay = scanner.nextInt();

        System.out.println("Ayın Kaçıncı Günü Doğdunuz");
        gun = scanner.nextInt();

        if (ay == 1) {

            if (gun <= 21) {
                System.out.println("Oğlak Burcusunuz.");
            } else
                System.out.println("Kova Burcusunuz");

        } else if (ay == 2) {

            if (gun <= 19) {
                System.out.println("Kova Burcusunuz.");
            } else
                System.out.println("Balık Burcusunuz");

        } else if (ay == 3) {

            if (gun <= 20) {
                System.out.println("Balık Burcusunuz.");
            } else
                System.out.println("Koç Burcusunuz");

        } else if (ay == 4) {

            if (gun <= 20) {
                System.out.println("Koç Burcusunuz.");
            } else
                System.out.println("Boğa Burcusunuz");

        } else if (ay == 5) {

            if (gun <= 21) {
                System.out.println("Boğa Burcusunuz.");
            } else
                System.out.println("İkizler Burcusunuz");

        } else if (ay == 6) {

            if (gun <= 22) {
                System.out.println("İkizler Burcusunuz.");
            } else
                System.out.println("Yengeç Burcusunuz");

        } else if (ay == 7) {

            if (gun <= 22) {
                System.out.println("Yengeç Burcusunuz.");
            } else
                System.out.println("Aslan Burcusunuz");

        } else if (ay == 8) {

            if (gun <= 22) {
                System.out.println("Aslan Burcusunuz.");
            } else
                System.out.println("Başak Burcusunuz");

        } else if (ay == 9) {

            if (gun <= 22) {
                System.out.println("Başak Burcusunuz.");
            } else
                System.out.println("Terazi Burcusunuz");

        } else if (ay == 10) {

            if (gun <= 22) {
                System.out.println("Terazi Burcusunuz.");
            } else
                System.out.println("Akrep Burcusunuz");

        } else if (ay == 11) {

            if (gun <= 21) {
                System.out.println("Akrep Burcusunuz.");
            } else
                System.out.println("Yay Burcusunuz");

        } else if (ay == 12) {

            if (gun <= 21) {
                System.out.println("Yay Burcusunuz.");
            } else
                System.out.println("Oğlak Burcusunuz");

        } else
            System.out.println("Geçerli bir ay girmediniz.");
    }
}
