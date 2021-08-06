package Odevler;

import java.util.Scanner;

public class Odev8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)  ;

        System.out.print("Bir Sayı Giriniz :");
        int n = input.nextInt();

        for (int i = (n-1); i >= 0 ; i--) {
            for (int j = (n-i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i +1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
