package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);


        System.out.println("enter the 1st number: ");
        double num1 = sc.nextDouble();


        System.out.println("enter the 2nd number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operator(*,-,+,/)");
        char operator = sc.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result=num1+num2;
                break;

            case '-':
                result=num1-num2;
                break;

            case '*':
                result=num1*num2;
                break;

            case '/':
                result=num1/num2;
                break;

            default:
                System.out.println("Error! invalid operator");
                return;

        }

        System.out.println("The results is "+result);
    }
}
