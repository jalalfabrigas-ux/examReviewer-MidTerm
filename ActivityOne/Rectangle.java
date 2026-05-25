package ActivityOne;

public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(String NameShape,double length,double width){
        super("RECTANGLE");
        this.length=length;
        this.width=width;
    }public double getLength(){
        return length;
    }public void setLength(double length){
        this.length=length;
    }public double getWidth(){
        return width;
    }public void setWidth(double width){
        this.width=width;
    }
    @Override
    public double area(){
        return length * width;
    }

}

//base * width