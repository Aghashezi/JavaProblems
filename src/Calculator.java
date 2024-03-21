import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        double n,m ,result=0;
        Scanner ref=new Scanner(System.in);
        System.out.println("Enter an operator: like +, / ,*,%,_");
        operator=ref.next().charAt(0);
        System.out.print("Enter first number:");
        n= ref.nextInt();
        System.out.print("Enter second Number");
        m=ref.nextInt();
        switch (operator)
        {
            case '+':
                result=n+m;
                System.out.print("The result is:"+result);
                break;
            case '-':
                result=n-m;
                System.out.println("The result is :" + result);
                break;
            case '*':
                result=n*m;
                System.out.println("Result is:" + result);
                break;

            case '/':
                result=n/m;
                System.out.println("Result is:" + result);
                break;

            case '%':
                result=n*m;
                System.out.println("Result is:" + result);
                break;
            default:
                System.out.println("Invalid operator");

        }

    }
}
