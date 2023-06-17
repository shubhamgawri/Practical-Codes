import java.util.Scanner;
public class Ship
{
public static void main(String[] args) {
 
Scanner s = new Scanner(System.in);
int q = 20;
int count=1;
System.out.println("The Ship carries 20 items and each port has 10 items");
System.out.println("Enter the port from which the ship starts");
System.out.println("Port A");
System.out.println("Port B");
System.out.println("Port C");
char ch = s.next().charAt(0);
while (count <=3)
{
System.out.println("Enter 1 to pick items and 2 to drop items from port "+ch);
Scanner s1 = new Scanner(System.in);
int item = s1.nextInt();
s1.close();
if(item==1)
 {
 System.out.println("How much do you want to pickup");
 Scanner s2 = new Scanner(System.in);
 int pick = s2.nextInt();
 s2.close();
 q = q + pick;
 }
 
else if(item==2)
 {
 System.out.println("How much do you want to drop");
 Scanner s3 = new Scanner(System.in);
 int drop = s3.nextInt();
 s3.close();
 q = q - drop;
 }
if(ch == 'C')
ch='A'; 
else
ch++;
 
count++;
if(count<=3)
 System.out.println("Ship goes to the next port "+ch);
else
 System.out.println("Ship goes back to its home");
 
}
System.out.println("Number of items the ship holds now are "+ q);
s.close();
} 
}