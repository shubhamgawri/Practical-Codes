import java.util.*;
class Main
{

 public static Vector add(Vector v, String str) 
 {
 v.addElement(str);
 return v;
 }

 public static Vector rem(Vector v, String str) 
 {
 v.remove(str);
 return v;
 }

 public static int search(Vector v, String str) 
 {
 if (v.contains(str)) 
 {
 return 1;
 } 
 else 
 return 0;
 }

 public static Vector rep(Vector v, String str, String str2) 
 {
 Collections.replaceAll(v, str, str2);
 return v;
 }

 public static void main(String args[]) 
 {
 Vector<String> v = new Vector<String>();
 String str, str2;
 int count = 1;
 Scanner sc = new Scanner(System.in);
 while (count == 1) 
 {
 System.out.println("Enter your choice: ");
 System.out.println("1.Add Item\n2.Remove\n3.Replace\n4.Search\n5.Exit");
 int n = sc.nextInt();
 switch (n) 
 {
 case 1:System.out.println("Enter number of items: ");
 int x = sc.nextInt();
 System.out.println("Enter items to be added: ");
 for (int i = 0; i < x; i++) 
 {
  str = sc.next();
  add(v, str);
 }
 break;
 case 2:
  System.out.println("Enter item to be removed: ");
  str = sc.next();
  rem(v, str);
  break;
 case 3:
  System.out.println("Items: " + v);
  System.out.println("Enter item to replace: ");
  str = sc.next();
  System.out.println("Enter new item: ");
  str2 = sc.next();
  rep(v, str, str2);
  break;
 case 4:
  System.out.println("Enter item to be searched: ");
  str = sc.next();
  if (search(v, str) != 0) 
  {
  System.out.println("Vector contains: " + str);
  } else 
  {
  System.out.println("The vector does not contain" + str);
  }
  break;
 case 5:
  count = 0;
  System.out.println("\nTHANKS FOR SHOPPING!" + v);
  System.exit(0);
  }
 }
 }
 }