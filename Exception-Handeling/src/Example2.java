public class Example2 {
    Example2(int arr[]) {
        try {
            int num = arr[3]*10;
            System.out.println("This won't execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Thrown");
            e.printStackTrace();;
        }
    }
}
