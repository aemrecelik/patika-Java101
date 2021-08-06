package Odevler;

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        int sayi ,a, min=2147483647 , max=-2147483648;
        int i =1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz:");
        a=scanner.nextInt();
        while (i<=a){
            System.out.println(i+". Sayıyı giriniz.");
            sayi=scanner.nextInt();
            if(sayi<min)
                min=sayi;
            if(max<sayi)
                max=sayi;
            i++;
        }
        System.out.println("Max değer: "+max);
        System.out.println("Min değer: "+min);
    }
}
