package Pratikler;

import java.util.Scanner;

public class Pratik9 {

    public static void main(String[] args) {
        double sicaklik;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hava Sıcaklığı Kaç Derece: ");
        sicaklik = scanner.nextDouble();

        if (sicaklik <= 5) {
            System.out.println("Kayağa gidebilirsiniz");
        } else if (sicaklik <= 25) {
            if (sicaklik <= 15)
                System.out.println("Sinemaya gidebilirsiniz");
            if (sicaklik >= 10)
                System.out.println("Pikniğe gidebilirsiniz");
        } else
            System.out.println("Yüzmeye gidebilirsiniz");
    }

}

