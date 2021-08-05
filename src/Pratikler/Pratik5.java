package Pratikler;

import java.util.Scanner;

public class Pratik5 {

    public static void main(String[] args) {
        double alan,a,yaricap;
        final double pi=3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz: ");
        yaricap=scanner.nextDouble();

        System.out.println("Dairenin merkez açısını giriniz: ");
        a=scanner.nextDouble();

        alan= (pi*(yaricap*yaricap)*a)/360;
        System.out.println("Dairenin alanı: " + alan);
    }
}
