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
            

            if(type == 1){
                System.out.print("\n");
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