public class StringContainerClass {
    private String item;

    public String getItem(){
        return item;
    }

    public void setItem(String item){
        this.item = item;
    }
    
    public static void main(String[] args) throws Exception {

        StringContainerClass cont = new StringContainerClass();
        cont.setItem("Java Programming");
        System.out.println(cont.getItem());
    }
}
