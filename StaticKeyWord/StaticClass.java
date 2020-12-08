package StaticKeyWord;

public class StaticClass {

    private static String str = "BeginnersBook";

    // Static Class
    static class MyNestedStaticClass{
        
        //non-static method
        public void disp() {
    
           /* If you make the str variable of outer class
            * non-static then you will get compilation error
            * because: a nested static class cannot access non-
            * static members of the outer class.
            */
           System.out.println(str); 
        }
    
    }

    class MyNestedNonStaticClass{
        //non-static method
        public void disp() {
            System.out.println("Called from Non-static class"); 
        }
    }

    public static void main(String args[])
    {
        /* To create instance of nested class we didn't need the outer
        * class instance but for a regular nested class you would need 
        * to create an instance of outer class first
        */
        StaticClass.MyNestedStaticClass obj = new StaticClass.MyNestedStaticClass();
        obj.disp();

        StaticClass sc = new StaticClass();
        MyNestedNonStaticClass obj2 = sc.new MyNestedNonStaticClass();
        obj2.disp();
    }
}
