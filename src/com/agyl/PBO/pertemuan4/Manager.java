package com.agyl.PBO.pertemuan4;

public class Manager extends Pegawai{
    public void bonus(int bonus){
        System.out.println("pegawai atas nama " + nama + " (" + nim + ")" + " mendapatkan bonus sebesar " + bonus);
    }

    public void extrainfo (){
        System.out.println("jabatan pegawai: manager");
    }
    public void bonus (){
            System.out.println("error : masukkan nominal bonus");
        }
}
