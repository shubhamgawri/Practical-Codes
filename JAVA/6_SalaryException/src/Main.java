import java.util.*;
class PayoutofBoundsException extends Exception
{
  PayoutofBoundsException()
  {
      System.out.println("Salary less than 8000");
  }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary");
        int s=sc.nextInt();
        try{
        if(s<8000)
        {
            throw new PayoutofBoundsException();
        }
        else
        {
            System.out.println("Enter DearnessAllowance(DA), HRA , TravellingAllowance(TA), Professional Tax(PT), TDS");
            float da = sc.nextFloat();
            float hra = sc.nextFloat();
            float ta = sc.nextFloat();
            float pt = sc.nextFloat();
            float tds = sc.nextFloat();
            float gross = s+da+ta+hra-pt-tds;
            System.out.println("Gross Salary = "+gross);
            
        }
        }catch(PayoutofBoundsException e)
        {
             System.out.println(e);
        }
    }
}

