package com.agyl.PBO.pertemuan2;

import java.util.Scanner;
public class ug2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan Nama Anda : ");
        String nama = input.nextLine();

        System.out.println("Gaji yang Diterima Oleh " + nama +
                " Adalah Sebagai Berikut");

        System.out.println("Gaji :");
        double gaji = input.nextDouble();

        System.out.println("Tunjangan :");
        double tunjangan = input.nextDouble();

        System.out.println("Pajak : 7.65 %");

        double Gaji_kotor = gaji + tunjangan;
        double Pajak_negara = Gaji_kotor * 0.0765;
        double Gaji_bersih = Gaji_kotor - Pajak_negara;

        System.out.println("Total Gaji Bersih Dari " + nama + " yang Diterima Yaitu " + Gaji_bersih);


    }
}
