package ActivityOne;

public abstract class Shape{
    private String NameShape;
    public Shape(String NameShape){
        this.NameShape=NameShape;
    }public String getShapeName(){
        return NameShape;
    }public void setShapeName(String NameShape){
        this.NameShape=NameShape;
    }
    abstract double area();
    

    public void display(){
        System.out.print("\nSHAPE NAME: " + getShapeName());
    }
}