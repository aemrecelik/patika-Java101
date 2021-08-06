package Odevler;

import java.util.Scanner;

public class Odev3 {

    public static void main(String[] args) {
        double mesafe, fiyat, indirimliFiyat=0;
        int yas, secim;
        double kmFiyat = 0.10;
        double cocukIndirim = 0.50;
        double gencIndirim = 0.10;
        double yasliIndirim = 0.30;
        double gidisDonusIndirim = 0.20;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz : ");
        mesafe = scanner.nextDouble();
        System.out.println("Yaşınızı giriniz : ");
        yas = scanner.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        secim = scanner.nextInt();


        fiyat = mesafe * kmFiyat;


        if (yas < 12) {
            if (secim == 1 && mesafe>0) {
                indirimliFiyat = fiyat - (fiyat * cocukIndirim);
            } else if (secim == 2 && mesafe>0) {
                indirimliFiyat = fiyat - (fiyat * cocukIndirim);
                indirimliFiyat= (indirimliFiyat -(indirimliFiyat*gidisDonusIndirim))*2;
            } else {
                System.out.println("Hatalı Veri Girişi!");
                System.exit(0);
            }
        } else if (yas >= 12 && yas < 24) {

            if (secim == 1 && mesafe>0) {
                indirimliFiyat = fiyat - (fiyat * gencIndirim);
            } else if (secim == 2 && mesafe>0) {
                System.out.println("fiyat");
                indirimliFiyat = fiyat - (fiyat * gencIndirim);
                System.out.println(indirimliFiyat);
                indirimliFiyat= (indirimliFiyat -(indirimliFiyat*gencIndirim))*2;
            } else {
                System.out.println("Hatalı Veri Girişi!");
                System.exit(0);
            }
        }else if(yas>65){
            if (secim == 1 && mesafe>0) {
                indirimliFiyat = fiyat - (fiyat * yasliIndirim);
            } else if (secim == 2 && mesafe>0) {
                indirimliFiyat = fiyat - (fiyat * yasliIndirim);
                indirimliFiyat= (indirimliFiyat -(indirimliFiyat*gidisDonusIndirim))*2;
            } else {
                System.out.println("Hatalı Veri Girişi!");
                System.exit(0);
            }
        }else{
            if (secim == 1 && mesafe>0) {
                indirimliFiyat = fiyat;
            } else if (secim == 2 && mesafe>0) {
                indirimliFiyat = (fiyat - (fiyat * gidisDonusIndirim))*2;
            } else {
                System.out.println("Hatalı Veri Girişi!");
                System.exit(0);
            }
        }
        System.out.println("Toplam Tutar: "+indirimliFiyat);

    }
}
