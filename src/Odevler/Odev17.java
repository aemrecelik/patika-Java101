package Odevler;

import java.util.Arrays;
import java.util.Scanner;

public class Odev17 {


    public static void main(String[] args) {

        int matrix[][]={{1,2,3},{4,5,6}};
        int row=matrix.length;
        int col=matrix[0].length;
        int matrixT[][]=new int[col][row];

        for(int i=0 ; i<row;i++){
            for (int j=0;j<col;j++){
                matrixT[j][i]=matrix[i][j];
            }
        }

        System.out.println("Matris : "+ Arrays.toString(matrix[0]));
        System.out.println("         "+ Arrays.toString(matrix[1]));

        System.out.println("Matris Transpozu "+ Arrays.toString(matrixT[0]));
        System.out.println("                 "+ Arrays.toString(matrixT[1]));
        System.out.println("                 "+ Arrays.toString(matrixT[2]));


    }
}

