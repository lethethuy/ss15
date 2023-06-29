package baitap1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        try {
            System.out.println("Nhap so nguyen thu nhat: ");
            number1 = getInFormUser(scanner);

            System.out.println("Nhap so nguyen thu 2: ");
            number2 = getInFormUser(scanner);

            int sum = number1 + number2;
            System.out.println("Tong 2 so nguyen la: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Loi: Ban da nhap gia tri khong phai so nguyen.");
        }


    }

    public static int getInFormUser(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Loi: Ban da nhap gia tri khong dung vui long nhap lai.");
            scanner.nextLine();
            return getInFormUser(scanner);
        }
    }

}
