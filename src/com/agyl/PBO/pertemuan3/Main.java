package com.agyl.PBO.pertemuan3;

public class Main {
    public static void main(String[] args) {
        //pembuatan class
        SepedaMotor Honda = new SepedaMotor("honda", "vario", 35000000);
        SepedaMotor yamaha = new SepedaMotor("yamaha", "mio", 35000000);
        SepedaMotor Vespa = new SepedaMotor("vespa", "vespa matic", 35000000);

        //mengisi nilai atrribute object Honda
    /*   Honda.merk = "Honda";
        Honda.tipe = "Vario 160";
        Honda.harga = 35000000; */

        //mengisi nilai atrribute object yamaha
        yamaha.merk = "yamaha";
        yamaha.tipe = "N max";
        yamaha.harga = 35000000;

        //mengisi nilai atrribute object Vespa
        Vespa.merk = "yamaha";
        Vespa.tipe = "Vespa matic";
        Vespa.harga = 35000000;

        Honda.showinfo();
        yamaha.showinfo();
        Vespa.showinfo();

        //ujicoba geter dan seter
        System.out.println("motor merk " + Honda.getMerk() + " dengan tipe (sebelum) : " + Honda.getTipe());
        Honda.setTipe("beat 110");
        System.out.println("motor merk " + Honda.getMerk() + " dengan tipe (sesudah) : " + Honda.getTipe());
    }
}
