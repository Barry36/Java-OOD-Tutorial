package NestedClass.NonStatic;


/*
    * Inner class can be private or protected
    * Inner class use cases
        - Accessing the Private Members
        - Improve encapulation
*/
class Outer_Demo {
    public Outer_Demo(){
        System.out.println("Outer_Demo constructor!");
    }

    int publicNum = 1;
    protected int protectedNum = 10;
    private int privateNum = 100; 
    


    // private inner class
    private class Inner_Private_Demo {
       public void print() {
          System.out.println("This is an inner class, private var value: " + privateNum + " public var value: " + publicNum + " protectedNum: " + protectedNum);
       }
    }
    
    // public inner class
    class Inner_Demo{
        public int getNum() {
            System.out.println("This is the getnum method of the inner class");
            return protectedNum;
         }
    }

    // Accessing the inner class from the method within
    void display_private_inner() {
        Inner_Private_Demo inner = new Inner_Private_Demo();
       inner.print();
    }
 }

public class InnerClass {
    public static void main(String[] args) {

        // Drive private inner class
        Outer_Demo outer = new Outer_Demo();
        outer.display_private_inner();

        // Drive public inner class
        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
        int varFromOuterDemo = inner.getNum();
        System.out.println(varFromOuterDemo);
    }
}
