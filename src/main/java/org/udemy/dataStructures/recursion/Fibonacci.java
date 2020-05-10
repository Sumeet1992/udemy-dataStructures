package org.udemy.dataStructures.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		 int n = 5;
		 int fibonacci  = getFibonacci(n);
		 System.out.println("Fibonacci : "+fibonacci);
	}
	
	public static int getFibonacci(int n){
		if(n == 0)
			throw new RuntimeException("Number of elements should be atleast 1");
		else if(n == 1 || n == 2){
			System.out.println(n-1);
			return n-1;
		}
		else{
			int fib = (getFibonacci(n-1) + getFibonacci(n-2));
			System.out.println(fib);
			return (fib);}
	}

}
