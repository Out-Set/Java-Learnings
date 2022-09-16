
public class App {
    public static void main(String[] args){
        thisKeyword th1 = new thisKeyword();
        th1.fun(5);

    }
}

class thisKeyword {
    int x = 7;
    void fun(int x){
        System.out.println(x + this.x);
    }
}

class c{
    c(){
        System.out.println("nothing passed");
        System.out.println( );
    }

    c(int x, int y){
        System.out.println("two args passed");
        System.out.println(x+y);
        System.out.println();
    }
    c(int x, char y){

    }

    c(int x, int y, int z){
        System.out.println("3 args passed");
        System.out.println(x+y+z);
    }
}