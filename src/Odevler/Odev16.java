package Odevler;

import java.util.Arrays;

public class Odev16 {
    public static void main(String[] args) {

        int[] dizi = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(dizi));
        int[] tekrarEden = new int[dizi.length];
        int tekrarEdenSayisi = 0;

        for (int i = 0; i < dizi.length; i++) {

            boolean flag = true;

            for (int k = 0; k < tekrarEden.length; k++) {
                if (tekrarEden[k] == dizi[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                tekrarEden[tekrarEdenSayisi++] = dizi[i];
        }

        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < tekrarEdenSayisi; i++) {
            int sayac = 0;
            for (int k = 0; k < dizi.length; k++) {
                if (tekrarEden[i] == dizi[k])
                    sayac++;
            }
            System.out.println(tekrarEden[i] + " sayısı " + sayac + " kadar tekrar edildi.");
        }


    }
}
