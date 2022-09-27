class ArrayMiddleElement {

    public <T> T getMiddle(T... arr) {
        return arr[arr.length/2];
    }
}

public class GenericMethodArrayMiddleElement {
    public static void main(String[] args) throws Exception {

        ArrayMiddleElement obj = new ArrayMiddleElement();
        String s = obj.getMiddle("A", "B", "C", "D", "E");
        System.out.println(s);
    
        int a = obj.getMiddle(12,13,14,15,16);
        System.out.println(a);
    }
}
