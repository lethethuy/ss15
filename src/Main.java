public class Main {
    public  static void main(String[] args) {
        try {
            // khối code có thể phát sinh lỗi
            int div = 100 / 0;
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[5]);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}