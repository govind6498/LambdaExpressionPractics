package com.bridgelabz.lambdaexpressionpractics;
@FunctionalInterface
interface IMathFunction{
	int calculate(int a,int b);
	static void printResult(int a,int b,String function,IMathFunction fobj) {
		System.out.println("Result of "+function+" is "+fobj.calculate(a,b));
	}
}
public class MathOperation {
	public static void main(String[] args) {
		IMathFunction add =  Integer::sum;
		IMathFunction sub = (x,y)->x-y;
		IMathFunction mul = (x,y)->x*y;
		IMathFunction div = (x,y)->x/y;
		
		IMathFunction.printResult(6,3,"Addition",add);
		IMathFunction.printResult(6,3,"Subtratcion",sub);
		IMathFunction.printResult(6,3,"Multiplication",mul);
		IMathFunction.printResult(6,3,"Division",div);
		
		
	}
}
