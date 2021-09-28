package com.bridgelabz.lambdaexpressionpractics;
@FunctionalInterface
interface IMathFunction{
	int calculate(int a,int b);
}
public class MathOperation {
	public static void main(String[] args) {
		IMathFunction add =  Integer::sum;
		IMathFunction sub = (x,y)->x-y;
		IMathFunction mul = (x,y)->x*y;
		IMathFunction div = (x,y)->x/y;
		
		System.out.println("Addition is:"+add.calculate(5,8));
		System.out.println("Subtration is:"+sub.calculate(5,8));
		System.out.println("Multiplication is:"+mul.calculate(5,8));
		System.out.println("Division is:"+div.calculate(5,8));
	}
}
