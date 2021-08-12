package Pratikler;

import java.util.Arrays;
import java.util.Scanner;

public class Pratik27 {
    public static void main(String[] args) {
        int dizi[]={15,12,788,1,-1,-778,2,0};
        int min=-2147483648,max=2147483647;
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<dizi.length;i++){
            if(dizi[i]<n){
                if(dizi[i]>min)
                    min=dizi[i];
            }else if(dizi[i]>n){
                if(dizi[i]<max)
                    max=dizi[i];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);
    }
}
