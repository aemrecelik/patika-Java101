package Pratikler;

import java.util.Scanner;

public class Pratik20 {
    public static void main(String[] args) {
        int ebob=0,ekok,sayi1,sayi2,carpim,kucuk;
        int i=1;
        Scanner scanner= new Scanner(System.in);

        System.out.println("1. Sayıyı giriniz:");
        sayi1=scanner.nextInt();
        System.out.println("2. Sayıyı giriniz:");
        sayi2=scanner.nextInt();
        if(sayi1<sayi2){
            kucuk=sayi1;
        }else
            kucuk=sayi2;
        while (i<kucuk){
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;
                i++;
            }else
                i++;
        }
        ekok=sayi1*sayi2/ebob;
        System.out.println("Sayıların EBOB'u : "+ ebob);
        System.out.println("Sayıların EKOK'u : "+ ekok);
    }
}
