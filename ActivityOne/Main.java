package ActivityOne;
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        Shape bwahaha;

        System.out.print("\nCHOOSE SHAPE:");
        System.out.print("\n1. Rectangle");
        System.out.print("\n2. Circle");
        System.out.print("\n3. Triangle");
        System.out.println("\nEnter Choice");
        int choice = sc.nextInt();
        System.out.print("\nName of Shape: ");
        String NameShape=sc.nextLine();
        sc.nextLine();
        
        if(choice == 1){
            System.out.println("===RECTANGLE===");
            System.out.print("Enter Length: ");
            double length = sc.nextDouble();
            System.out.print("Enter Width: ");
            double width = sc.nextDouble();
            
            bwahaha = new Rectangle(NameShape,length,width);
            bwahaha.display();
            System.out.println();
            System.out.println("Area: " + bwahaha.area());

        } else if(choice == 2){
            System.out.println("===Circle===");
            System.out.print("Enter Radius: ");
            double r = sc.nextDouble();
            
            bwahaha = new Circle(NameShape,r);
            bwahaha.display();
            System.out.println();
            System.out.println("Area: " + bwahaha.area());

        } else if(choice == 3){
            System.out.println("===Triangle===");
            System.out.print("Enter Base: ");
            double base = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();
            bwahaha = new Triangle(NameShape,base,height);
            bwahaha.display();
            System.out.println();
            System.out.println("Area: " + bwahaha.area());
        
        }else{
            System.out.println("INVALID INPUT!!!");
        }
        
        sc.close();
        
    }
}