import java.util.Scanner;
class BitwiseShift
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("1.<<");
            System.out.println("2.>>");
            System.out.println("3.>>>");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.close();
            switch(choice)
            {
                case 1:
                System.out.println(num<<1);
                System.out.println(num<<2); 
                break;
                case 2:
                System.out.println(num>>1);
                System.out.println(num>>2);
                break;
                case 3:
                System.out.println(num>>>1); 
                System.out.println(num>>>2);
                break;
                default:
                System.out.println("Please enter a valid input."); 
                break;
            }
        }
    }