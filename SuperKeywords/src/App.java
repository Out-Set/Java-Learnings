public class App {
    public static void main(String[] args) throws Exception {
        
        Derived d = new Derived(10, 20, "Sawan");
        d.show();
    }
}

class Base {
    int num1;
    String name;
    Base(int a, String str){
        num1 = a;
        name = str;
    }
}

class Derived extends Base{
    int num2;
    Derived(int a, int b, String str){
        super(a, str);
        num2 = b;
    }

    void show(){
        System.out.println("a = "+num1 +" b = "+num2 + " name = "+name);
    }
}

