package Odevler;

public class Odev10 {
    public static void main(String[] args) {
        int sayi1=0,sayi2=1,temp;
        System.out.print(sayi1 + " "+ sayi2);
        while (sayi2!=34){
            sayi1+=sayi2;
            temp=sayi1;
            System.out.print(" "+ temp);
            sayi1=sayi2;
            sayi2=temp;


        }
    }
}
