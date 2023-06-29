package thuchanh3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;

        try {
            System.out.print("Nhập số nguyên thứ nhất: ");
            number1 = getIntFromUser(scanner);

            System.out.print("Nhập số nguyên thứ hai: ");
            number2 = getIntFromUser(scanner);

            int sum = number1 + number2;
            System.out.println("Tổng hai số nguyên là: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên.");
        }
    }

    public static int getIntFromUser(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên. Vui lòng nhập lại.");
            scanner.nextLine(); // Xóa đầu vào không hợp lệ
            return getIntFromUser(scanner); // Đệ quy để yêu cầu người dùng nhập lại
        }
    }
}
