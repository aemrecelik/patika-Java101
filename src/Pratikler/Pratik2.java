package Pratikler;

import java.util.Scanner;

public class Pratik2 {


    public static void main(String[] args) {
        boolean urunFiyatiMi = true;
        double kdv=0;
        double urunFiyati=0, kdvliFiyat=0, kdvTutari=0;
        Scanner scanner = new Scanner(System.in);

        while (urunFiyatiMi) {
            System.out.println("Ürün fiyatını giriniz");
            urunFiyati = scanner.nextDouble();
            if ((urunFiyati > 0) && (urunFiyati <= 1000)) {
                kdv = 0.18;
                urunFiyatiMi = false;
            } else if (urunFiyati > 1000) {
                kdv = 0.08;
                urunFiyatiMi = false;
            } else {
                System.out.println("Geçersiz ürün fiyatı girdiniz !\n Fiyatı Tekrar giriniz: ");
                urunFiyatiMi = true;
            }
        }


        kdvTutari = urunFiyati * kdv;
        kdvliFiyat = kdvTutari + urunFiyati;

        System.out.println("Ürün Fiyatı : " + urunFiyati);
        System.out.println("KDV'li Fiyatı : " + kdvliFiyat);
        System.out.println("KDV Tutarı : " + kdvTutari);

    }

}
