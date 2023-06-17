import java.util.*; 

class person { 
 String name = new String(); 
 int age;
 String gender;
 person(){} 
 person(String name, int age,String gender){ 
 this.name = name; 
 this.age = age;
 this.gender = gender; 
 } 
} 
class cricketer extends person{ 
 float StrikeRate; 
 int Centuries; 
 cricketer(String name, int age,String gender,float StrikeRate, int Centuries){ 
 super(name, age, gender); 
 this.StrikeRate = StrikeRate; 
 this.Centuries = Centuries; 
 } 
 
 public String toString() { 
 return String.format("Name = "+name+", Age = "+age+",Gender = "+gender+" Strike Rate = "+StrikeRate+", Number of Centuries = "+Centuries); 
 } 
} 
public class Player { 
 public static void main(String[] args){ 
 Scanner sc = new Scanner(System.in); 
 System.out.println("Enter name, age, gender, runrate, number of centuries: "); 
 String name = sc.next(); 
 int age = sc.nextInt();
 String gender = sc.next();
 float strikerate = sc.nextFloat(); 
 int century = sc.nextInt(); 
 cricketer c1 = new cricketer(name, age, gender, strikerate, century); 
 System.out.println(c1); 
 sc.close();
 } 
}