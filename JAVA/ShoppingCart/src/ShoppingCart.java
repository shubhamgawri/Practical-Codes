import java.util.*;
class Shopping{
 
 int rate,q;
 String item_name;
 void input(){
 
 Scanner s= new Scanner(System.in);
 System.out.print("\nWhat would you like to buy? : ");
 item_name=s.next();
 System.out.print("Enter Quantity of "+item_name+" : ");
 q=s.nextInt();
 System.out.print("Enter the price of "+item_name+" : ");
 rate=s.nextInt();
 s.close();
}
 void display(){
 System.out.println("\nName of Item is "+item_name);
 System.out.println("Quantity of "+item_name+" is "+q);
 System.out.println("Total Amout : "+q*rate);
}
}
class ShoppingCart{
 public static void main(String[]args){
 Shopping a=new Shopping();
 a.input();
 a.display();
 } 
}