package StaticDynamicType;
public class Rectangle extends Shape{
    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        System.out.println("Rectangle!");
    }

    public Rectangle(double side){
        this.length = side;
        this.width = side;
        System.out.println("Rectangle BUT Square!");
    }
    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width*length;
    }

    public void scaleWidth(int w){
        if(isSquare()){
            width *= w;
            length *= w;
        }else{
            width *= w;
        }
    }

    public void scaleLength(int l){
        if(isSquare()){
            width = width*l;
            length = length*l;
        }
        else{
            length *= l;
        }
        
    }

    public void printRectangle(){
        System.out.println("Hello from Rectangle!");
    }

    public void f(){
       System.out.println("Hey");
    }

    private boolean isSquare(){
        return width == length;
    } 

    public void disp(){
        System.out.println("Display from Rectangle!");
    }
}
