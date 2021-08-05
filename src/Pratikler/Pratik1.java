package Pratikler;

import java.util.Scanner;

public class Pratik1 {

    public static void main(String[] args) {
        double fizikNot, kimyaNot, matNot, turkceNot, muzikNot, tarihNot, ortalama;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fizik notunuzu giriniz:");
        fizikNot = scanner.nextDouble();

        System.out.println("Kimya notunuzu giriniz:");
        kimyaNot = scanner.nextDouble();

        System.out.println("Matematik notunuzu giriniz:");
        matNot = scanner.nextDouble();

        System.out.println("Türkçe notunuzu giriniz:");
        turkceNot = scanner.nextDouble();

        System.out.println("Müzik notunuzu giriniz:");
        muzikNot = scanner.nextDouble();

        System.out.println("Tarih notunuzu giriniz:");
        tarihNot = scanner.nextDouble();

        ortalama = (fizikNot + kimyaNot + matNot + turkceNot + muzikNot + tarihNot) / 6;
        System.out.println("Not ortalamanız : " + ortalama);
        System.out.println(ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

    }

}
