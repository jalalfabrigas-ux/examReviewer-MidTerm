package ActivityOne;

public class Circle extends Shape{
    private double r;
    public Circle(String ShapeName,double r){
        super("CIRCLE");
        this.r=r;
    }   public double getR(){
        return r;
    }   public void setR(double r){
        this.r=r;
    }
    @Override
    public double area(){
        return Math.PI * r * r;
    }
}

//Math.PI * r * r;