package Pratikler;

import java.util.Scanner;

public class Pratik16 {

    public static void main(String[] args) {
        int sayi,us,total=1;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı girin : ");
        sayi=scanner.nextInt();

        System.out.println("Kaçıncı üssünün alınacağını girin : ");
        us=scanner.nextInt();

        for(int i =1 ; i<=us ; i++){
            total*=sayi;
        }
        System.out.println(sayi+ " nin "+us+". cu kuvveti "+ total);
    }
}
