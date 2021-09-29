package com.bridgelabz.lambdaexpressionpractics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class NumberPlayList {
	public static void main(String[] args) {
		//Creating sample collection
		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}

		//Method1:traversing using Iterator
		Iterator<Integer> it= myNumberList.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.println("Mth1:Iterator value:"+i);
		}

		//Method2:Traversing with Explicit Consumer interface Implementation
		class myConsumer implements Consumer<Integer>{
			public void accept(Integer t) {
				System.out.println("Mth2:Consumer imple value::"+t);
			}
		}
		myConsumer action = new myConsumer();
		myNumberList.forEach(action);

		//Method3:Traversing with Anonymous Consumer interface implementation
		myNumberList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("Mth3:ForEach anonymous class value:"+t);
			}
		});

		//Method4:Explicit Lambda function
		//		Consumer<Integer> myListAction =n->{
		//			System.out.println("Mth4:foreach Lambda impl value::"+n);
		//
		//		}
		//		myNumberList.forEach(myListAction);

		//Method 5:Implicit lambda function
		myNumberList.forEach(n->{
			System.out.println("Mth5:forEach Lambda impl value:"+n);
		});

		//Method 6:Implicit Lambda function to print double value
		Function<Integer,Double>toDoubleFunction =n-> n.doubleValue();
		myNumberList.forEach(n->{
			System.out.println("Mth6:foreach Lambda double value::"+toDoubleFunction.apply(n));	
		});
	}
}
