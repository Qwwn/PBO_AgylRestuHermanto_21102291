package com.agyl.PBO.pertemuan6;

public class TryCatch {
    public static void main(String[] args) {
        //array
        int[] nomor = {1,2,3,4,5};

        try{
            System.out.println(nomor[6]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("lebih batas");
        }
        System.out.println("done");
    }
}
