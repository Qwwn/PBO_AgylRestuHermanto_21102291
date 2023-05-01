package com.agyl.PBO.pertemuan2;

public class perulangan {
    public static void main(String[] args){
        for (int i=0; i<10; i++){
            System.out.println("looping... ("+i+")");
        }
        System.out.println("Looping for selesai!");

        int j=1;
        while (j<=100){
            System.out.println("looping while ... ("+j+")");
            j+=25;
        }
        System.out.println("looping while selesai!");

        int k=10;
        do{
            System.out.println("looping do while... ("+k+")");
            k--;
        }
        while (k>0);
        System.out.println("looping do while selesai!");
    }
}
