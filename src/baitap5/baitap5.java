package baitap5;

import java.util.Arrays;
import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7};
        Arrays.sort(numbersArray);
        System.out.println("Nhập phần tử cần tìm kiếm: ");
        int target = scanner.nextInt();
        try {
            int result = binarySearch(numbersArray, target);
            System.out.println("Phần tử " + target + " là một phần tử của mảng tại vị trí " + result);
        } catch (ElementNotFoundException e) {
            System.out.println("Không tìm thấy phần tử trong mảng");
        }
    }

    public static int binarySearch(int[] arr, int target) throws ElementNotFoundException {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        throw new ElementNotFoundException();
    }
}

class ElementNotFoundException extends Exception {
}