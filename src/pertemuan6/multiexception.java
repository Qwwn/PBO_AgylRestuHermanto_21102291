package pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;
public class multiexception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("masukkan bilangan: ");
            int bilangan1 = input.nextInt();

            System.out.println("masukkan pembaginya: ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1/bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil);
        }
        //multiple exception
//        catch (ArithmeticException | InputMismatchException e) {
//            System.out.println("error");
//        }

        //multiple catch
        catch (ArithmeticException e){
            System.out.println("error");
        }
        catch (InputMismatchException e){
            System.out.println("masukan angka saja");
        }

        System.out.println("done");
    }
}
