package baitap6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap vao so bi chia");
        int soBiChia = scanner.nextInt();

        System.out.println("hay nhap vao so chia");
        int soChia = scanner.nextInt();

        try{
            double result = tooTal(soBiChia,soChia);
            System.out.println("Ket qua phep chia la "+ result);
        }catch (ArithmeticException e){
            System.out.println("Loi: so chia bang 0");

        }

    }

    public static double tooTal(int soBiChia, int soChia) throws ArithmeticException {
        if (soChia == 0) {
            throw new ArithmeticException();
        }
        return soBiChia/soChia;

    }
}
