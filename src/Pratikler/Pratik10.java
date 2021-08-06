package Pratikler;

import java.util.Scanner;

public class Pratik10 {

    public static void main(String[] args) {
        double sayi1,sayi2,sayi3;
        Scanner scanner=new Scanner(System.in);

        System.out.println("1. Sayıyı Giriniz: ");
        sayi1=scanner.nextDouble();

        System.out.println("2. Sayıyı Giriniz: ");
        sayi2=scanner.nextDouble();

        System.out.println("3. Sayıyı Giriniz: ");
        sayi3=scanner.nextDouble();

        if(sayi1<sayi2 && sayi1<sayi3){
            if (sayi2<sayi3){
                System.out.println("sayi1<sayi2<sayi3");
            }else
                System.out.println("sayi1<sayi3<sayi2");
        }else if(sayi2<sayi3 && sayi2<sayi1){
            if (sayi1<sayi3){
                System.out.println("sayi2<sayi1<sayi3");
            }else
                System.out.println("sayi2<sayi3<sayi1");
        }else {
            if (sayi2<sayi1){
                System.out.println("sayi3<sayi2<sayi1");
            }else
                System.out.println("sayi3<sayi1<sayi2");
        }
    }
}
