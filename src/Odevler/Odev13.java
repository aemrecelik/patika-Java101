package Odevler;

import java.util.Scanner;

public class Odev13 {

    static int desen(int n){
        System.out.print(n + " ");
        if(n <= 0) {
            return n;
        }
        int temp = desen(n-5)+5;
        System.out.print(temp + " ");
        return temp;
    }

    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        sayi=scanner.nextInt();
        desen(sayi);
    }
}
