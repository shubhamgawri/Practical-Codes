class Main
{
public static void main(String[] args)
{
StringBuffer str1 = new StringBuffer(args[0]);
StringBuffer str2 = new StringBuffer(args[1]);
str1.append("Start_");
str2.append("_end");
str1.insert(0,"aaa");
str2.insert(0, "zzz");
System.out.println(str1);
System.out.println(str2);
str1.replace(0,2, "s");
str2.replace(1,3, "t");
System.out.println(str1);
System.out.println(str2);
str1.delete(0,2);
str2.delete(1,3);
System.out.println(str1);
System.out.println(str2);
str1.reverse();
str2.reverse();
int x=str1.capacity();
int y= str2.capacity();
System.out.println(x);
System.out.println(y);
str1.ensureCapacity(30);
str2.ensureCapacity(40);
System.out.println(str1.charAt(1));
System.out.println(str2.charAt(2));
System.out.println(str1.length());
System.out.println(str2.length());
System.out.println(str1.substring(5));
System.out.println(str1.substring(2));
}

}