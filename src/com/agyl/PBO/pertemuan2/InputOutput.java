package com.agyl.PBO.pertemuan2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan nama anda : ");
        String nama = input.nextLine();
        System.out.println("apakah anda ingin menambah paket yang akan anda beli (Ya/Tidak) : ");
        String tambah = input.nextLine();

        System.out.println("selamat pagi " + nama + "!");
    }
}
