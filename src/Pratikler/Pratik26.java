package Pratikler;

import java.sql.Array;

public class Pratik26 {
    public static void main(String[] args) {

        double[] a= {8,14,78,125,23};
        double n=a.length;
        double sum=0;
        for(int i=0; i<a.length;i++){
            sum+=1/a[i];
        }
        System.out.println(n/sum);
    }
}
