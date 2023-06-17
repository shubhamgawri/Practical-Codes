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

class Line{
Point p1=new Point();
Point p2=new Point();
Line(int x1,int y1,int x2,int y2){
p1.x=x1;
p1.y=y1;
p2.x=x2;
p2.y=y2;}
Line (){ }
double length(){
double len=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
return len;
}
}

class Triangle{
Line l1=new Line();
Line l2=new Line();
Line l3=new Line();
Scanner s=new Scanner(System.in);
Triangle(){
System.out.println("Enter co-ordinates of triangle (x1,y1,x2,y2,x3,y3)");
l1.p1.x=s.nextInt();
l1.p1.y=s.nextInt();
l1.p2.x=s.nextInt();
l1.p2.y=s.nextInt();
l2.p1.x=l1.p2.x;
l2.p1.y=l1.p2.y;
l2.p2.x=s.nextInt();
l2.p2.y=s.nextInt();
l3.p1.x=l2.p2.x;
l3.p1.y=l1.p2.y;
l3.p2.x=l1.p1.x;
l3.p2.y=l1.p1.y;
}
void perimeter(){
 double perim=(l1.length()+l2.length()+l3.length());
 System.out.println("Perimeter of triangle is "+perim);
}
}

class Main{
public static void main(String []args){
Point p=new Point();
p.display();
Line l=new Line(1,4,6,9);
System.out.println("Length of my line is "+ l.length());
Triangle t=new Triangle();
t.perimeter();
}    
}