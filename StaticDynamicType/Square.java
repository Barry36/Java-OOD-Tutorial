package StaticDynamicType;
public class Square extends Rectangle{

    public Square(double side){
        super(side, side);
        // System.out.println("Square!");
    }

    public void printSquare(){
        System.out.println("Hello from Square!");
    }

    public void disp(){
        System.out.println("Display from Square!");
    }
}
