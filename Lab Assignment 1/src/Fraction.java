/**
 * 
 * @author 012754597
 * 
 */
import java.util.*;
/*
 * This will be your Fraction Class that will take in Fractions and do basic functions with them
 */
public class Fraction 
{
    /** numerator – top of fraction */
    private int num;
    /** denominator – bottom of fraction */
    private int den;
 
    
    Scanner input = new Scanner(System.in);
    /**
     * Constructor
     * 
     * @param n
     *            numerator
     * @param d
     *            denominator
     */
    public Fraction(int n, int d) 
    {
        num = n;
        den = d;
    }
    /**
     * Overloaded Fraction 
     */
    public Fraction()
    {
    	
    }

    /**
     * Displays a fraction
     */
    public void printFraction() 
    {
        System.out.print(num + "/" + den);
    }
    /**
     * This will take in a fraction and separate the numerator and denominator
     */
	public void inputFraction() 
	{
		
		System.out.println("Please input your fraction: ");
		String ans = input.next();
		
		String delims = "/";
		String[] tokens = ans.split(delims);
		num = Integer.parseInt(tokens[0]);
		den = Integer.parseInt(tokens[1]);
		
		
	}
	/**
	 * 
	 * Gets the numerator and returns it
	 */
    public int getNumerator()
    {
    	return num;
    	
    }
    /**
     * Gets the denominator and returns it
     */
    public int getDenominator()
    {
    	return den;
    }
    /**
     * Changes the numerator to desired value
     * @param value desired value
     */
    public void setNumerator(int value) 
    {
    	num = value;
    }
    /** 
     * Changes the denominator to desired value
     * @param value desired value
     */
    public void setDenominaotr(int value)
    {
    	den = value;
    }
   /**
    * finds the Greatest Common Divisor of the fraction
    * @param m will be the numerator
    * @param n will be the denominator
    * @return the greatest common divisor
    */
    private int gcd(int m, int n)
    {
    	int r;
    	while(n!=0)
    	{
    		r=m%n;
    		m=n;
    		n=r;
    	}
    	return m;
    }

   
   

    /**
     * Adds the implicit fraction to the explicit fraction and returns the
     * resulting fraction.
     * 
     * @param f
     *            fraction to add this fraction to
     */
    public Fraction add(Fraction f) 
    {
        int n = 1;
        int d = 1;
        if (this.den == f.den) {
            n = this.num + f.num;
            d = this.den;
        } else {
            n = this.num * f.den + f.num * this.den;
            d = this.den * f.den;
        }
        int g =  gcd(n,d);
        n=n/g;
        d = d/g;
        Fraction res = new Fraction(n, d);
        return res;
    }

    /**
     * Returns a string of the fraction
     */
    @Override
    public String toString() 
    {
        String s = num + "/" + den;
        return s;
    }

    /**
     * multiplies 2 fractions
     * @param second fraction
     * @return returns the product
     */
    public Fraction multiply(Fraction f)
    {
        int n = 1;
        int d = 1;
        n = this.num * f.num;
        d = this.den * f.den;
        int g =  gcd(n,d);
        n=n/g;
        d = d/g;

        Fraction answer = new Fraction(n, d);
        return answer;
    }

    /**
     * divides two fractions
     * @param second fraction
     * @return returns the quotient
     */
    public void divide(Fraction f1,Fraction f2)
    {
        int n = 1;
        int d = 1;
       
        n = f1.num * f2.den;
        d = f1.den * f2.num;
        int g =  gcd(n,d);
        n=n/g;
        d = d/g;
        Fraction answer = new Fraction(n, d);
        System.out.println(f1.num + "/" + f1.den + " / " + f2.num + "/" +  f2.den + " = "+ answer);

    }

    /**
     * subtracts 2 fractions
     * @param f second fraction
     * @return the difference
     */
    public void subtract(Fraction f1,Fraction f2) 
    {
        {
            int n = 1;
            int d = 1;
            int g = 0;
            if (f1.den == f2.den) 
            {
                n = f1.num - f2.num;
                d = f1.den;
            } else {
            	
                n = f1.num * f2.den - f2.num * f1.den;
                d = f1.den * f2.den;
                g =  gcd(n,d);
                n=n/g;
                d = d/g;
                
     
            	
            }
            Fraction answer = new Fraction(n, d);
            System.out.println(f1.num + "/" + f1.den + " - " + f2.num + "/" +  f2.den + " = " +answer);
        }
    }
    /**
     * divides the two fractions but finds the answer in decimal format
     * @param f1 first fraction
     * @param f2 second fraction
     * @return quotient in decimal format
     */
    public static double divReal(Fraction f1, Fraction f2)
    {
    	double n = 1; 
    	double d = 1; 
    	n = f1.num * f2.den;
    	d = f1.den * f2.num;
    	double answer = n/d;
    	return answer;
    }
	


}