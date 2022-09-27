// Generic Class With Multiple Example

class GenericClassConstructor<S, T> {
    S a;
    T b;

    public GenericClassConstructor(S a, T b) {
        this.a = a;
        this.b = b;
    }

    public void show(){
        System.out.println("a= "+a+", b= "+b);
    }
}


public class GenericClassWithMultipleTypesExample {
    public static void main(String[] args) throws Exception {

        GenericClassConstructor<Integer, String> myGenerics1 = new GenericClassConstructor<Integer, String>(10, "Hello");
        myGenerics1.show();

        GenericClassConstructor<String, Boolean> myGenerics2 = new GenericClassConstructor<String, Boolean>("Hello", true);
        myGenerics2.show();
    }
}
