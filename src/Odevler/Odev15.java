package Odevler;

import java.util.Scanner;

public class Odev15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin eleman sayısı: ");
        int n = scanner.nextInt();
        System.out.println("Dizinin elemanlarını girin :");
        int a[] = new int[n];
        for (int i = 0;i<a.length;i++){
            System.out.println((i+1)+". Eleman : ");
            a[i]=scanner.nextInt();
        }
        kucuktenBuyuge(a);
        System.out.println();
        buyuktenKucuge(a);
        System.out.println();
    }
    static void kucuktenBuyuge(int[] dizi){
        int gecici;
        for(int i = 0; i < dizi.length-1; i++)
        {
            for(int j = i+1; j < dizi.length; j++)
            {
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        for(int i = 0; i < dizi.length; i++)
        {
            System.out.print(dizi[i] + " ");
        }
    }
   static void buyuktenKucuge(int[] dizi){
        int gecici;
        for(int i = 0; i < dizi.length-1; i++)
        {
            for(int j = i+1; j < dizi.length; j++)
            {
                if(dizi[j] > dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        for(int i = 0; i < dizi.length; i++)
        {
            System.out.print(dizi[i] + " ");
        }
    }
}
