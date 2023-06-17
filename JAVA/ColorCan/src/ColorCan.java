import java.util.*; 
class ColorCan{ 
 public static void main(String[] args) 
 { 
 Scanner scan = new Scanner(System.in); 
 int i,opt, r=0, b=0, g=0; 
 double red = 10.0, blue = 10.0, green = 10.0,average=0.0; 
 System.out.println("Current capacity of the color cans is:"); 
 System.out.println("Red="+red+" Blue="+blue+" Green="+green+"\n"); 
 for(i=0; i<2; i++) 
 {
 System.out.println("Choose which color do you want:\n1. Red \n2. Blue \n3. Green\n"); 
 opt = scan.nextInt(); 
 switch(opt) 
 { 
 case 1: 
 { 
 System.out.println("Enter amounts in liters: "); 
 double amt = scan.nextFloat(); 
 red = red - amt; 
 
 System.out.println("Current capacity of the color cans is:"); 
 average=(red +blue+green)/3;
 if (average<4.0) 
 { 
 red = 10.0; 
 blue = 10.0; 
 green = 10.0; 
 r++; b++; g++; 
 System.out.println("All can have been refilled."); 
 } 
 System.out.println("Red="+red+" Blue="+blue+" Green"+green+"\n"); 
 if (red<=4.0) 
 {red = 10.0; 
 r++; 
 System.out.println("Red can has been refilled."); 
 } 
 break; 
 } 
 case 2: 
 { 
 System.out.println("Enter amounts in liters: "); 
 double amt = scan.nextFloat(); 
 blue = blue - amt; 
 System.out.println("Current capacity of the color cans is:"); 
 System.out.println("Red="+red+" Blue="+blue+" Green"+green+"\n"); 
 average= (red +blue+green)/3;
 if (average<4.0) 
 { 
 red = 10.0; 
 blue = 10.0; 
 green = 10.0; 
 r++; b++; g++; 
 System.out.println("All can have been refilled."); 
 } 
 if (blue<=4.0) 
 { 
 blue = 10.0; 
 b++; 
 System.out.println("Blue can has been refilled."); 
 } 
 break; 
 } 
 case 3: 
 { 
 System.out.println("Enter amounts in liters: "); 
 double amt = scan.nextFloat(); 
 green = green - amt; 
 System.out.println("Current capacity of the color cans is:"); 
 System.out.println("Red="+red+" Blue="+blue+" Green"+green+"\n"); 
 average= (red +blue+green)/3;
 if (average<4.0) 
 { 
 red = 10.0; 
 blue = 10.0; 
 green = 10.0; 
 r++; b++; g++; 
 System.out.println("All cans have been refilled"); 
 } 
 if (green<=4.0) 
 {green = 10.0; 
 g++; 
 System.out.println("Green can has been refilled."); 
 } 
 break; 
 } 
 default: 
 System.out.println("Invalid input!"); 
 break;
 }
 }
System.out.println("The cans are updated the following times:"); 
System.out.println("Red="+r+" Blue="+b+" Green="+g);
scan.close();
 }
}