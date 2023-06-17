import java.util.*;
public class Main 
{
    public static void main(String[] args)
{
int i;
String s = new String();
String name = new String();
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number of names:");
int n = scan.nextInt();
Vector<String> v = new Vector<String>();
System.out.println("Enter the names: ");
for(i=0; i<n; i++)
{
s = scan.next();
v.add(s);
}
System.out.println("Enter the name that needs to be searched: ");
name = scan.next();
int c = 0;
for(i = 0; i < n; i++)
{
if(v.get(i).equals(name))
{
c++;
break;
}
}
if(c > 0) 
 {
 v.remove(i);
 System.out.println(name + " has been removed.");
 }
 else 
 {
 v.add(name);
 System.out.println(name + " has been added.");
 }
System.out.println("The final array is: " + v);
}
}