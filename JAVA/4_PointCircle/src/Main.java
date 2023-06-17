import java.util.*;

class Point{
int x,y;
Point(){
x=0;y=0;  
}
Point(int x,int y){
this.x=x;
this.y=y;
}
void display(){
System.out.println("x="+x+"y="+y);    
}
}

class Circle{
Point p=new Point();
Circle(int x,int y){
p.x=x;
p.y=y;
}
Circle(){}
void Translate(){
int ch;
Scanner s=new Scanner(System.in);
System.out.println("Enter operation to perform\n1.Change x\n2.Change y\n3.Both x and y");
ch=s.nextInt();
switch(ch){
case 1:System.out.print("Enter new x co-ordinate: ");
p.x=s.nextInt();
break;
case 2:System.out.print("Enter new y co-ordinate: ");
p.y=s.nextInt();
break;
case 3:System.out.print("Enter new x and y co-ordinate: ");
p.x=s.nextInt();
p.y=s.nextInt();
break;
}
}
void display(){
System.out.println("Circle : \nX co-ordinate="+p.x+"\nY co-ordinate="+p.y+"\n");    
}
}

class Main {
public static void main(String []args){
Circle c=new Circle(4,3);
c.display();
c.Translate();
c.display();
}   
}