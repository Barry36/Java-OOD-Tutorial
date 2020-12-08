package StaticDynamicType;

public class Driver {
    public static void main(String[] args) {
        Square square = new Square(5.0);

        // square.f();
        System.out.println(square.width);
        System.out.println(square.length);        
    
        square.scaleLength(2);
        System.out.println(square.width);
        System.out.println(square.length);  
        

        // Static & Dynamic Type
        System.out.println("Barry");
        Rectangle rec = new Square(1.0);
        rec.disp();
    }
}
