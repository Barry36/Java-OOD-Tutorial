package AccessModifier;

class MyClass{
    int counter = 0;
}

public class Driver {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.counter);
    }
}

