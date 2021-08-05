package Pratikler;

import java.util.Scanner;

public class Pratik7 {

    public static void main(String[] args) {
        String kullaniciAdi, sifre, yeniSifre, hataliSifre;
        String secim;
        boolean sifreUygun = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı Adı: ");
        kullaniciAdi = scanner.nextLine();
        System.out.println("Şifre: ");
        sifre = scanner.nextLine();

        if ((kullaniciAdi.equals("aemrecelik")) && (sifre.equals("12345a"))) {
            System.out.println("Sisteme başarıyla giriş yaptınız.");
        } else {
            hataliSifre = sifre;
            System.out.println("Şifreniz hatalı şifrenizi değiştirmek ister misiniz?(y/n)");
            secim = scanner.next().toUpperCase();
            if (secim.equals("Y")) {
                System.out.println("Yeni bir şifre giriniz :");
                Scanner sc = new Scanner(System.in);
                while (sifreUygun) {

                    yeniSifre = sc.nextLine();
                    if (yeniSifre.equals(hataliSifre) || yeniSifre.equals("12345a")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");

                    } else {
                        System.out.println("Şifre oluşturuldu!");
                        sifreUygun=false;
                    }
                }

            } else if (secim.equals("N")) {
                System.out.println("Sistemden çıkılıyor...");

            } else
                System.out.println("Yanlış komut girildi!");
        }
    }
}
