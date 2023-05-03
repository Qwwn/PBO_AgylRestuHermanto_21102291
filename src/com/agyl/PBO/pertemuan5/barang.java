package com.agyl.PBO.pertemuan5;

public class barang {
    String nama;
    int harga;

    public barang(){}

    public barang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void showinfo(){
        System.out.println("nama : " + nama);
        System.out.println("harga : " + harga);
    }
}
