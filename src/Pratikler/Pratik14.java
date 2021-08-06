package Pratikler;

import java.util.Scanner;

public class Pratik14 {

    public static void main(String[] args) {
        int girilenSayi;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz.");
        girilenSayi = scanner.nextInt();

        for (int i = 1, j = 1, k = 1; (i < girilenSayi) || (j < girilenSayi); i *= 4, j *= 5, k++){
            if(i<girilenSayi)
                System.out.println("4 ün " + k +". üssü :" + i);
            if(j<girilenSayi)
                System.out.println("5 in " + k +". üssü :" + j);


        }

    }
}
