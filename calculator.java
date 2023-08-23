package javacalcy;
import java.math.*;
import java.util.Scanner;


class Operations{
	public int addition(int num1,int num2) {
		return num1+num2;
	}
	public int subtraction(int num1,int num2) {
		return num1-num2;
	}
	public int multiplication(int num1,int num2) {
		return num1*num2;
	}
	public double division(int num1,int num2) {
		double res = 0;
		try {
			res = num1/num2;
			return res;
		}
		catch(Exception e){
			System.out.println("Division By Zero Error \n"+e);
		}
		return res;
	}
}

public class calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Operations op = new Operations();
		System.out.println("Welcome to Unext Calculator");
		System.out.println("Enter first Number : ");
		int first = sc.nextInt();
		System.out.println("Enter second Number : ");
		int second = sc.nextInt();
		
		System.out.println("Enter Your Choice : ");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		int res = sc.nextInt();
		if(res == 1) {
			System.out.println(op.addition(first,second));
		}
		else if(res == 2) {
			System.out.println(op.subtraction(first,second));
		}
		else if(res == 3) {
			System.out.println(op.multiplication(first,second));
		}
		else if(res == 4) {
			System.out.println(op.division(first,second));
		}
		else {
			System.out.println("Invalid Choice Entry ");
		}
	}
}
