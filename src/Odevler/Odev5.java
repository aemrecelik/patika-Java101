package Odevler;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        int yil;
        Scanner sc = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");

        yil = sc.nextInt();
        if(((yil %4==0)&&(yil %100!=0))||(yil%400==0))
            System.out.println(yil+" artık bir yıldır");
        else
            System.out.println(yil+" artık bir yıl değildir.");
    }

}

