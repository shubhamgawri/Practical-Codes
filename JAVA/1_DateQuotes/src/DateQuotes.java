import java.util.*;
public class DateQuotes
{
public static void main(String[] args) {
System.out.println("Hello World");
String[] A={"Hello","How are you", "hi all", " whatsup","lazy day", "be happy", "have a good day", "keep smiling", "happy birthday", "good evening", "smile","be cool"};
int x=(int)((Math.random()*100)%12);
System.out.println(x+A[x]);
Random r= new Random();
int y=r.nextInt(12);
System.out.println(y+A[y]);
Date d1 = new Date();
        System.out.println("Current date is " + d1);
        Calendar calendar = Calendar.getInstance();  
   System.out.println("The current date is : " + calendar.getTime()); 
}
}