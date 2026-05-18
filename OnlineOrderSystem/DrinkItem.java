package OnlineOrderSystem;
public class DrinkItem extends FoodItem{
    private int size;

    public DrinkItem(String name,double price,int size){
        super(name,price);
        this.size=size;
    }   public int getSize(){
        return size;
    }   public void setSize(int size){
        this.size=size;
    }   
    @Override
    public double getTotalPrice(){
        double multiplier;
        switch(size){
            case 1:
                multiplier = 1.0;
                break;
            case 2:
                multiplier = 1.2;
                break;
            case 3:
                multiplier = 1.5;
                break;
            default:
                multiplier =1.0;
                break;
        }
            return getPrice() * multiplier;
    }
}