package com.agyl.PBO.pertemuan4;

public class main {
    public static void main(String[] args) {
        Manager managerkami = new Manager();
        Pegawai pegawaikami = new Pegawai();

        managerkami.nama = "agyl";
        managerkami.nim = 21102291;

        pegawaikami.nama = "restu";
        pegawaikami.nim = 21102292;

        managerkami.showinfo();
        managerkami.extrainfo();
        managerkami.bonus(1200000);
        managerkami.bonus();

        pegawaikami.showinfo();

    }
}
