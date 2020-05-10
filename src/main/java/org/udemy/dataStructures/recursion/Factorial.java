package org.udemy.dataStructures.recursion;

/**
 * Hello world!
 *
 */
public class Factorial 
{
    public static void main( String[] args )
    {
        int n = 5;
        int factorial = getFactorial(n);
        System.out.println("Factorial : "+factorial);
        
    }
    public static int getFactorial(int n){
    	if(n == 0 || n == 1)
    		return n; 
    	
		return (n * getFactorial(n-1));
    	
    }
}
