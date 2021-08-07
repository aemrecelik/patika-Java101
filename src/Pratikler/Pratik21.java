package Pratikler;

public class Pratik21 {
    static boolean palindromMu(int sayi){
        int tersSayi=0,mod ,temp=sayi;
        while (temp!=0){
            mod=temp%10;
            tersSayi=tersSayi*10+mod;
            temp/=10;

        }
        return sayi == tersSayi;
    }
    public static void main(String[] args) {
        System.out.println(palindromMu(343));

    }
}
