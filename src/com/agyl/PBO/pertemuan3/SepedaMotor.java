package com.agyl.PBO.pertemuan3;

public class SepedaMotor {
    //atrribute
    String merk;
    String tipe;
    int harga;

    //constructor
    public SepedaMotor(){}

    //constructor berparamater
    public SepedaMotor(String merk, String tipe, int harga){
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getMerk(){
        return merk;
    }

    public void setmerk(String merk){
        this.merk = merk;
    }

    public String getTipe(){
        return tipe;
    }

    public void setTipe(String tipe){
        this.tipe = tipe;
    }

    public int getHarga(){
        return harga;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }



    //method
    public void showinfo(){
        System.out.println("merk : " + merk);
        System.out.println("tipe : " + tipe);
        System.out.println("harga : " + harga);
        System.out.println();
    }

}

