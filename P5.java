public class P5{
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
