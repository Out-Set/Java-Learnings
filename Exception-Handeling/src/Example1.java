public class Example1 {
    Example1(String str){
        try {
            int x;
            x = Integer.parseInt("str");
            System.out.println("This won't execute");
        } 
        catch (NumberFormatException eObj) {
            //TODO: handle exception
            System.out.println("Exception Caught");
            System.out.println(eObj.getMessage());
        }
        {
            System.out.println("Out of try-catch block");
        }
    }
}

