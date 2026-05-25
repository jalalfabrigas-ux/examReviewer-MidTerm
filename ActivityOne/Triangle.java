package ActivityOne;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(String NameShape,double base, double height){
        super("TRIANGLE");
        this.base=base;
        this.height=height;
    }   public double getBase(){
        return base;
    }   public void setBase(double base){
        this.base=base;
    }   public double getHeight(){
        return height;
    }   public void setHeight(double height){
        this.height=height;
    }
    @Override
    public double area(){
        return 0.5 * base * height;
    }
}

// 0.5 * base * height