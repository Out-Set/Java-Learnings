// This container can contain any type of data.2

class GenericContainerClass  <T>{
    private T item;

    public T getItem(){
        return item;
    }

    public void setItem(T item){
        this.item = item;
    }
    public static void main(String[] args) throws Exception {

        // for string
        GenericContainerClass<String> strCont = new GenericContainerClass<String>();
        strCont.setItem("Generic String Container");
        System.out.println(strCont.getItem());

        // for integer
        GenericContainerClass<Integer> intCont = new GenericContainerClass<Integer>();
        intCont.setItem(45);
        System.out.println(intCont.getItem());
    }
}
