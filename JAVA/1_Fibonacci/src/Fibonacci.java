import java.util.*;
    class Fibonacci
    {
        public static void main(String[] args) 
        {  
            int n,result;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the term number: \n");
            n=s.nextInt();
            result=fib(n);
            System.out.println(n+"th fibonacci number is :"+result);
            s.close();
        }
       
        static int fib(int m)
        {
            int a=0,b=1,c=0;
            if(m==1)
             return 0;
             else if(m==2)
             return 1;
             else
             {
                 for(int k=1;k<=m-2;k++)
                 {
                     c=a+b;
                     a=b;
                     b=c;
                 }
                 return c;
             }
        }
    }
    