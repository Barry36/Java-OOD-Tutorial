package NestedClass.NonStatic;

/*
    Usecase:
        - whenever you need to override the method of a class or an interface
        - Anonymous Inner Class as Argument
            - if a method accepts an object of an interface, an abstract class, or a concrete class, 
              then we can implement the interface, extend the abstract class, and pass the object to the method. 
              If it is a class, then we can directly pass it to the method.
*/
class PublicClass{
    public String greet(){
        return "from concrete class";
    }
}

abstract class AnonymousInner {
    public abstract void mymethod();
    public String greet(){
        return "from abstract class";
    }
 }

 interface Message {
    String greet();
 }

public class AnonymousInnerClass {

    public void displayMessage(Message m) {                             // takes an object of Interface as argument
        System.out.println(m.greet() +
           ", Greeting from Interface");  
     }

    public void displayMessage(AnonymousInner anonymousInner) {         // takes an object of Abstract Class as argument
        System.out.println(anonymousInner.greet() +
            ", Greeting from Abstract Class");  
    }

    public void displayMessage(PublicClass publicClass) {               // takes an object of Concrete Class as argument
        System.out.println(publicClass.greet() +
            ", Greeting from Concrete Class");  
    }

    public static void main(String args[]) {

        // Drive: AnonymousInner class
        AnonymousInner inner = new AnonymousInner() {
           public void mymethod() {
              System.out.println("This is an example of anonymous inner class");
           }
        };
        inner.mymethod();
        
        // Drive: Anonymous Inner Class as Argument, Interface
        AnonymousInnerClass obj = new AnonymousInnerClass();

        // Passing an anonymous inner class as an argument
        obj.displayMessage(new Message() {
            public String greet() {
                return "Interface: Hello";
            }
        });

        // Drive: Anonymous Inner Class as Argument, Abstract Class
        obj.displayMessage(new AnonymousInner(){
            // @override
            public void mymethod() {
                System.out.println("Nothing");
            }

            // @override
            public String greet(){
                return "Abstract Class: Overriden by Anonymous Inner class";
            }
        });

        // Drive: Anonymous Inner Class as Argument, Concrete Class
        obj.displayMessage(new PublicClass() {
            public String greet(){
                return "Concrete Class: Overriden by Anonymous Inner class";
            }
        });
     }
}
