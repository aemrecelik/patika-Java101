package Odevler;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        double boy, kilo, vki;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo=scanner.nextDouble();

        vki=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+ vki);
    }
}
