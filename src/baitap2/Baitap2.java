package baitap2;

public class Baitap2 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println("So lon trong mang la: " + findMaxNumber(number));
        } catch (IllegalArgumentException e) {
            System.out.println("Loi: " + e.getMessage());

        }

    }

    public static int findMaxNumber(int[] arr) {

        if (arr.length==0){
            throw new IllegalArgumentException("Mang Rong");
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
