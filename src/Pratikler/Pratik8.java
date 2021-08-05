package Pratikler;

import java.util.Scanner;

public class Pratik8 {

    public static void main(String[] args) {
        double mat,fizik,turkce,kimya,muzik,ortalama,toplam=0;
        int ortDersSayisi=5;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Matematik notunu giriniz: ");
        mat=scanner.nextDouble();

        System.out.println("Fizik notunu giriniz: ");
        fizik=scanner.nextDouble();

        System.out.println("Türkçe notunu giriniz: ");
        turkce=scanner.nextDouble();

        System.out.println("Kimya notunu giriniz: ");
        kimya=scanner.nextDouble();

        System.out.println("Müzik notunu giriniz: ");
        muzik=scanner.nextDouble();

        if(mat<0 || mat>100){
            ortDersSayisi--;
        }else
            toplam+=mat;
        if(fizik<0 || fizik>100){
            ortDersSayisi--;
        }else
            toplam+=fizik;
        if(turkce<0 || turkce>100){
            ortDersSayisi--;
        }else
            toplam+=turkce;
        if(kimya<0 || kimya>100){
            ortDersSayisi--;
        }else
            toplam+=kimya;
        if(muzik<0 || muzik>100){
            ortDersSayisi--;
        }else
            toplam+=muzik;

        ortalama=toplam/ortDersSayisi;

        if(ortalama<55){
            System.out.println("Ortalamanız " + ortalama + " dersi geçemediniz.");
        }else
            System.out.println("Ortalamanız "+ ortalama + " dersi geçtiniz");




    }
}
