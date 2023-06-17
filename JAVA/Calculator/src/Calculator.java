import java.util.Scanner;
class Calculator
{
    public static void main(String[] args) 
    {
        char operator;
        Double number1,number2,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an operator: +,-,*,/");
        operator = input.next().charAt(0);
        // asking user to enter numbers
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();
        
        System.out.print("Enter second Number: ");
        number2 = input.nextDouble();
        input.close();
        switch (operator) 
        {
            //addition
            case '+':
            result = number1 + number2;
            System.out.println(number1+"+"+number2+"=" +result);
                 break;
            //subtraction
            case '-':
            result = number1 - number2;
            System.out.println(number1+"-"+number2+"=" +result);
                 break;
            //multiplication
            case '*':
            result = number1 * number2;
            System.out.println(number1+"*"+number2+"=" +result);
                 break;
            //division
            case '/':
            result = number1 / number2;
            System.out.println(number1+"/"+number2+"=" +result);
                 break;     
            
            
            default:
            System.out.println("Invalid Operation");
                break;
       }
    }    
}