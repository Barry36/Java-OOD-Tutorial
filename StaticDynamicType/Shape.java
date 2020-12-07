package StaticDynamicType;

// Shape.java: abstract base class
public abstract class Shape {       // abstract class, can't instantiate
   
// to implement an idNumber
   private static int counter = 0;
   private int idNumber;

   
   public Shape () {
      idNumber = ++counter;
      System.out.println("Shape!");
   }
   public int getIdNumber() { return idNumber;}

   public abstract double getArea();
   public abstract String getName(); // abstract, so omit body
   public void printShape(){
       System.out.println("Hello from Shapre!");
   }

   public void f(){
       System.out.println("yoo");
   }
} 
