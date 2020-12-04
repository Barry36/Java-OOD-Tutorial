package NestedClass.Static;
/*
    - can access it without creating an object of the outer class:
    - just like static attributes and methods, a static inner class does not have access to members of the outer class.
*/

class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);
    }
}
