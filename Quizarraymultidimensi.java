package com.mycompany.quizarraymultidimensi;

import java.util.Scanner;

public class Quizarraymultidimensi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan jumlah barang: ");
        int jumlahbarang = s.nextInt();
        String[][] databarang = new String[jumlahbarang][2];
        for (int i = 0; i < jumlahbarang; i++) {
            System.out.println("Barang ke-" + (i + 1));
            System.out.print("Nama barang: ");
            databarang[i][0] = s.next();
            System.out.print("Harga barang: ");
            databarang[i][1] = s.next();
        }
        System.out.println("\nData Barang:");
        for (int i = 0; i < jumlahbarang; i++) {
            System.out.println("Barang ke-" + (i + 1));
            System.out.println("Nama barang: " + databarang[i][0]);
            System.out.println("Harga barang: " + databarang[i][1]);
            System.out.println("---------------------");
        }
    }
}
