package Answers;


import java.util.Scanner;

public class Q4ArithmeticException {
	public static void main(String[] args) {
	System.out.print("Enter the first number: ");//User input -->10
	Scanner s= new Scanner(System.in);
	int num1=s.nextInt();
	int num2=0;
	System.out.println("second number as zero: "+num2);//Second number is Zero
	try
	{
		int num=num1/num2;
	}
	catch (Exception e) {
		// TODO: handle exception
		System.err.println("Number Can't be Divide by Zero" );
		e.printStackTrace(); 
	}
	finally {
		
	}
}
}
