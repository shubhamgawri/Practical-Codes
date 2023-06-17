import java.util.*;
class Factorial
{  
    int fact = 1;
    int recursive(int n)
    {
        if(n == 1 || n == 0)
        {
          return fact;
        }
        else
        {
          fact*=n;
          return(recursive(n-1));
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial has to be found: ");
        int num = sc.nextInt();
        Factorial obj = new Factorial();
        int factorial = obj.recursive(num);
        System.out.println("Factorial of the number is: "+factorial);
        sc.close();
    }
}