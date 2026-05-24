package OnlineOrderSystem;
import java.util.*;

public class Main{
    public static  void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("==WELCOME TO ONLINE ORDER SYSTEM");
        System.out.print("\n ENTER HOW MANY ORDERS: ");
        int n = sc.nextInt();
        FoodItem[] order = new FoodItem[n];
        for(int i=0;i<n;i++){
        
            System.out.print("\nWHAT WOULD YOU LIKE TO ORDER? ^_^");

            System.out.print("\n 1. FOOD | 2. DRINK");
            int type = sc.nextInt();
            System.out.print("\n Name of Product? ");
            int name = sc.nextLine();
            System.out.print("\n Price of Product? ");
            double price = sc.nextDouble();
            
            sc.nextLine();

            if(type == 1){
                System.out.print("\n==FOOD MENU==");
                System.out.print("\nQuantity of Order? ");
                int quantity=sc.nextInt();
                
            }
            else if(type == 2){
                System.out.print("\n");
            }
            else{
                System.out.print("\nInvalid Input!")
            }

            
        }
    }
}