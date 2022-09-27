// Instance.getClass().getName(): use to get the data-type of instance

class TypeName<T> {
    T a;

    TypeName(T a){
        this.a = a;
    }

    void showType(){
        String s = a.getClass().getName();
        System.out.println(s);
    }
}

public class ShowTypeNameOfInstance {
    public static void main(String[] args) throws Exception {

        TypeName<String> objStr = new TypeName<String>("Hello");
        objStr.showType();

        TypeName<Integer> objInt = new TypeName<Integer>(100);
        objInt.showType();
    }
}
