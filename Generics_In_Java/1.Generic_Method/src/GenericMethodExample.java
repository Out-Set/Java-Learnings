public class GenericMethodExample {
    
    static public <T> void genericMethod(T gdata) {
        System.out.println("You passed = " + gdata);
    }

    public static void main(String[] args) throws Exception {
        GenericMethodExample.<String>genericMethod("Java Programming");
        genericMethod(25);
    }
}
