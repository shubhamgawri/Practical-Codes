import java.util.*;

abstract class Person{
String Name;
String Code;
abstract void Update();
abstract void Display();
}

interface Admin{
int Experience = 10;
abstract void Update();
abstract void Display();
}

class Account extends Person{
float Pay;
public void Update(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Name: ");
Name = sc.nextLine();
System.out.print("Enter the Code: ");
Code = sc.nextLine();
System.out.print("Enter Payment: ");
Pay = sc.nextFloat();
}

public void Display(){
System.out.println("Pay: "+ Pay);
}
}

class Master extends Account implements Admin{

public void Display(){
System.out.println("Name: "+ Name);
System.out.println("Code: " + Code);
System.out.println("Pay: "+ Pay );
System.out.println("Experience: "+ Experience);
}
}

public class Main {
public static void main(String[] args) {
Master m =new Master();
Account ac = new Account();
m.Update();
m.Display();
}
}