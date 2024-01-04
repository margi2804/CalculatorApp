package com.miit.calculator;
import java.util.Scanner;

class calc{
	public double add(double a, double b) {
		return a + b;
	}
	public double sub(double a, double b) {
		return a - b;
	}
	public double multiply(double a, double b) {
		return a * b;
	}
	public double divide(double a, double b) {
		if(b==0) {
			throw new ArithmeticException("Division by 0 is invalid");
		}
		return (double) a / b;
	}
}
public class calculator 
{
    private static Scanner sc;

	public static void main( String[] args )
    {
        sc = new Scanner(System.in);
        calc calc1 = new calc();
        double result;
        int option;
        while (true){
        	
        	System.out.println("Enter First Number: ");
	        double num1 = sc.nextDouble();
	        System.out.println("Enter Second Number: ");
	        double num2 = sc.nextDouble();
	        
	        System.out.println("Press number to select operations from below list: ");
	        System.out.println("1 -> Addition");
	        System.out.println("2 -> Subtraction");
	        System.out.println("3 -> Multiplication");
	        System.out.println("4 -> Division");
	        System.out.println("0 -> Exit");
	        option = sc.nextInt();
	        
	        if(option==0) {
	        	System.out.println("Calculator has been exited.");
                break;
	        }
	        
	        switch(option) {
	        case 1:
	        	System.out.println("addition");
	        	result = calc1.add(num1 , num2);
	        	break;
	        case 2:
	        	result = calc1.sub(num1 , num2);
	        	break;
	        case 3:
	        	result = calc1.multiply(num1 , num2);
	        	break;
	        case 4:
	        	try {
	        		result = calc1.divide(num1 , num2);
	        		System.out.println("Devision Result : "+result);
	        	}catch(ArithmeticException e) {
	        		System.out.println(e.getMessage());
	        	}
	        	continue;
	        default:
                System.out.println("Invalid operation. Please try again.");
                continue; // Continue the loop for another operation
	        }
	        System.out.println("Result: " + result);
            sc.nextLine(); // Clear the scanner buffer
        }
    }
}
