package com.agyl.PBO.pertemuan2;

import java.util.Scanner;
public class ug1 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("masukan username anda : ");
        String username = input.nextLine();

        System.out.println("masukan password anda : ");
        String password = input.nextLine();

        if(username.equals("admin") && password.equals("admin")){
            System.out.println("Login Berhasil Silakan Masuk");
        } else if (username.isEmpty() && password.isEmpty()){
            System.out.println("Silakan Login Dengan Username " +
                    "dan Password yang Sah!");
        } else {
            System.out.println("Username dan Password Anda Salah");
        }

    }
}
