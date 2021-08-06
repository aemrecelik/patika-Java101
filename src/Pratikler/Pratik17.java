package Pratikler;

import java.util.Scanner;

public class Pratik17 {
    public static void main(String[] args) {
        int sayi,basamakSayisi=0, tempSayi,basamakDegeri,toplam=0;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        sayi=scanner.nextInt();

        tempSayi=sayi;
        while(tempSayi!=0){

            basamakDegeri=tempSayi%10;
            toplam+=basamakDegeri;
            tempSayi/=10;
        }
        System.out.println(sayi+" nın basamakları toplamı " + toplam);
    }
}
