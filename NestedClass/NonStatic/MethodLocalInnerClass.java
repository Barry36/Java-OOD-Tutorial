package NestedClass.NonStatic;

/*
    * Local class
        - the scope of the inner class is restricted within the method.
        - A method-local inner class can be instantiated only within the method where the inner class is defined.
*/
public class MethodLocalInnerClass {
    void my_Method() {
        int num = 23;
  
        // method-local inner class
        class MethodInner_Demo {
           public void print() {
              System.out.println("This is method inner class "+num);	   
           }   
        } // end of inner class
         
        // Accessing the inner class
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
     }
     
     public static void main(String args[]) {
        MethodLocalInnerClass outer = new MethodLocalInnerClass();
        outer.my_Method();	   	   
     }
}
