package com.agyl.PBO.pertemuan5;

public class main {
    public static void main(String[] args) {
        //array kosong
        barang[] keranjang = new barang[10];
        //array tidak kosong
        barang[] etalase = {
                new barang("pulpen", 3000),
                new barang("pensil", 2000),
                new barang("garpu", 4000),
        };

        System.out.println("jumlah barang etalase : " + etalase.length);
        System.out.println("jumlah barang etalase : ");

        int i =1;
        for(barang b : etalase){
            System.out.println("barang ke " + i);
            b.showinfo();
            i++;
        }

        for (int j=0; j<etalase.length;j++){
            System.out.println("barang ke " +(j+1));
            etalase[j].showinfo();
        }

    }
}
