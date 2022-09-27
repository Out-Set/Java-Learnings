public class FindSumGenericMethod1 {

    public static <T extends Number> double genericMethodSumTwo(T a, T b) {
        return a.doubleValue()+b.doubleValue();
    }

    public static void main(String[] args) throws Exception {

        System.out.println(genericMethodSumTwo(3, 5));
        System.out.println(genericMethodSumTwo(6.5f, 6.7f));
        System.out.println(genericMethodSumTwo(3.5, 4.5));   
        
        // Compilation Error: since T is extending a number but here you passed the string.
        // System.out.println(genericMethodSumTwo("a", "b"));
    }
}
