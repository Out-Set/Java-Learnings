public class ClassInterfaceBoundedTypeExample {

    public static <T extends Number & Comparable<T>> double minArr(T... a) {
        if(a == null || a.length == 0){
            return 0.0;        
        }

        T min = a[0];
        for(int i=1; i<a.length; i++){
            if(min.compareTo(a[i])>0){
                min = a[i];
            }
        }

        return min.doubleValue();
    }
    public static void main(String[] args) throws Exception {

        double m = minArr(15, 8, 3, 9, 45, 12);
        System.out.println(m);

        double m1 = minArr(1.5, 8.3, 9.45, 1.2);
        System.out.println(m1);
    }
}
