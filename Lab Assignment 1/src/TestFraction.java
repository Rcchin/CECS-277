/**
 * 
 * @author 012754597
 *
 */
import java.util.*;
/*
 * This will be the TestBench to test Fraction Class
 */
public class TestFraction{
    public static void main(String [] args)
    {
    	//This will be your object 
    	Fraction f = new Fraction();
    	String ans=" ";
    	int num1 = 0;
    	int den1= 0;
    	int num2 = 0;
    	int den2 = 0;
    	Scanner input = new Scanner(System.in);
    	//inputFraction will take in your first fraction
    	f.inputFraction();
    	Fraction f1 = new Fraction(f.getNumerator(),f.getDenominator());
    	num1 = f1.getNumerator();
    	den1= f1.getDenominator();
    	
    	//Then it will take in your second fraction
    	f.inputFraction();
    	Fraction f2 = new Fraction(f.getNumerator(),f.getDenominator());
    	num2 = f2.getNumerator();
    	den2 = f2.getDenominator();
    	
    	
    	//Addition
    	System.out.println("Now we will add the two fractions you have inputted!");
    	Fraction f3 = new Fraction(0,0);
    	f3 = f1.add(f2);
    	System.out.println(num1+ "/"+ den1 +" + "+ num2+ "/" + den2 + " = " + f3);
    	
    	
    	//Subtraction
    	System.out.println("Now we will subtract the two fractions you have inputted!");
    	f.subtract(f1, f2);
    	
    	//Multiplication
    	System.out.println("Now we will multiply the two fractions you ahve inputted!");
    	f3=f1.multiply(f2);
    	System.out.println(num1+ "/"+ den1 +" * "+ num2+ "/" + den2 + " = " + f3);
    	
    	//Division
    	System.out.println("Now we will divide the two fractions you have inputted!");
    	f.divide(f1,f2);
    	
    	
    	//Division with double 
    	System.out.println("Here is the quotient in decimal format!");
    	double realNum = f.divReal(f1, f2);
    	System.out.println(realNum);
    	
    	//Changes Numerator and Denominator. Prints them as well
    	f1.setNumerator(2);
    	f2.setDenominaotr(5);
    	
    	System.out.println("Numerator: " + f1.getNumerator());
    	System.out.println("Denominator: " + f2.getDenominator());

    	
    	
    	
    	
    	
        
    }
    
    
}