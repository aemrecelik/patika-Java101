package Pratikler;

import java.util.Scanner;

public class Pratik15 {

    public static void main(String[] args) {
        int n, r, kombinasyon, nFaktoriyel = 1, rFaktoriyel = 1, nrFaktoriyel = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini girin :");
        n = input.nextInt();
        System.out.print("Input r :");
        r = input.nextInt();
        if (n > r) {
            for (int i = 1; i <= n; i++) {
                nFaktoriyel *= i;
            }

            for (int j = 1; j <= r; j++) {
                rFaktoriyel *= j;
            }
            for (int k = 1; k <= (n - r); k++) {
                nrFaktoriyel *= k;
            }

            System.out.println(n+ " in Faktoriyeli = " +nFaktoriyel );
            System.out.println(r+ " in Faktoriyeli = " +rFaktoriyel);
            System.out.println((n-r) + " in Faktöriyeli = " + nrFaktoriyel);

            kombinasyon = nFaktoriyel/(rFaktoriyel*(nrFaktoriyel));
            System.out.println("kombinasyon = " +kombinasyon);
        }else {
            System.out.println("n r den büyük olmalı");
        }

    }
}
