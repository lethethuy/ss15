package baitap4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap vao mot chuoi");
        String input = scanner.nextLine();

        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            try {
                int number = Integer.parseInt(String.valueOf(input.charAt(i)));
                numberList.add(number);

            } catch (NumberFormatException e) {
                numberList.add(0);
                System.err.println("Loi: " + input.charAt(i) + " không phải số. đã thay đế bằng 0");
            }

        }
        System.out.println("Ket qua: "+numberList);


    }
}
