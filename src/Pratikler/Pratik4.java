package Pratikler;


import java.util.Scanner;

public class Pratik4 {
    public static void main(String[] args) {
        double km, totalUcret;
        int aclilisUcret = 10;
        final double kmUcret = 2.2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz(KM) :");
        km = scanner.nextDouble();

        totalUcret = aclilisUcret + (km * kmUcret);
        totalUcret= (totalUcret < 20) ? totalUcret=20 : totalUcret;

        System.out.println("Ödenecek Tutar: " + totalUcret + "TL dir");

    }

}
