package OnlineOrderSystem;

public class FoodItem extends MenuItem{
    private int quantity;

    public FoodItem(String name, double price, int quantity){
        super(name,price);
        this.quantity=quantity;
    }   public int getQuantity(){
        return quantity;
    }   public void setQty(int quantity){
        this.quantity=quantity;
    }   
    @Override
        public double getTotalPrice(){
            return getPrice() * getQuantity();

        }
    
}