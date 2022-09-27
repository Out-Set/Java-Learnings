public class GenericMethodSquare {
    
    public static <T extends Number> double genericMethodSqr(T a) {
        return a.doubleValue()*a.doubleValue();
    }

    public static void main(String[] args) throws Exception {

        System.out.println(GenericMethodSquare.<Integer> genericMethodSqr(4));
        System.out.println(genericMethodSqr(3.4));
    }
}
