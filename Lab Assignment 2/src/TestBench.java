
/**
 * @author Raymond Chin 012754597
 * This will be the Test Bench for the code.
 */
import java.util.*;
 
 
 
 
public class TestBench 
{
public static void main(String[] args) throws CloneNotSupportedException
{
    //test information on website
     
     
 
     
    Employee [] a1 = new Employee[9];
     
    a1[0] = new Staff("Allen","Paita","123","M",1959,2,23,50);
    a1[1] = new Staff("Zapata","Steven","456","F",1964,7,12,35);
    a1[2] = new Staff("Rios","Enrique","789","M",1970,6,2,40);
    a1[3] = new Faculty("Johnson","Anne","243","F",1962,4,27,Level.FU,"Ph.D","Engineering",3);
    a1[4] = new Faculty("Bouris","William","791","F",1975,3,14,Level.AO,"Ph.D","English",1);
    a1[5] = new Faculty("Andrade","Christopher","623","F",1980,5,2,Level.AS,"MS","Physical Education",0);
    a1[6] = new Partime("Guzman","Augusto","455","F",1977,8,10,35,30);
    a1[7] = new Partime("Depirro","Martin","678","F",1987,9,15,30,15);
    a1[8] = new Partime("Aldaco","Marque","945","M",1988,24,11,20,35);
    System.out.println("A:");
    System.out.println("---------------------------------------------------------------");
    for(int i = 0; i<9;i++)
    {
        System.out.println(a1[i].toString());
    }
    System.out.println("----------------------------------------------------------------");
    System.out.println("B:  Total Monthly Salary for Partime");
    System.out.println("----------------------------------------------------------------");
    double partimeTotal=0;
    for(int i = 0; i<9;i++)
    {
    	if(a1[i] instanceof Partime)
    	{
    		 partimeTotal=partimeTotal + a1[i].monthlyEarning();
    	}
       
    }
    System.out.println("The total Monthly Salary for Partime is: $" + partimeTotal);
    System.out.println("----------------------------------------------------------------");
    System.out.println("C: Total Monthly Salary for All Employees");
    System.out.println("----------------------------------------------------------------");
    double total = 0;
    for(int i = 0; i<9;i++)
    {
         
        total = total + a1[i].monthlyEarning();
    }
    System.out.println("The total monthly salary for all employees is: $" + total);
    System.out.println("----------------------------------------------------------------");
    System.out.println("D: Sorted by ID Number ");
    System.out.println("----------------------------------------------------------------");
    System.out.println(" " );
     
    bubbleSort(a1);
    for(int i = 0; i<9;i++)
    {
        System.out.println(a1[i].toString());
    }
     
    System.out.println("----------------------------------------------------------------");
     
    System.out.println("E: Sorted by Last Name " );
     
    System.out.println("---------------------------------------------------------------");
 
    bubbleSortbyName(a1);
    for(int i = 0; i<9;i++)
    {
        System.out.println(a1[i].toString());
    }
    System.out.println("----------------------------------------------------------------");
     
    System.out.println("F: Cloning");
    System.out.println("----------------------------------------------------------------");
 
 
    Faculty abc = new Faculty("Johnson","Anne","243","F",1962,4,27,Level.FU,"Ph.D","Engineering",3);
    Faculty xyz = (Faculty)abc.clone();
    Education e = new Education("MS","Engineering",3);
    xyz.setE(e);
    System.out.println("Clone: "+xyz.toString());
    System.out.println("Original: " + abc.toString());
    System.out.println("----------------------------------------------------------------");
 
 
     
     
     
}
/**
 * bubble sort will call compareTo or Comparable to compare by ID number
 * @param a1 will be the array with all your Employees
 */
public static void bubbleSort(Employee[] a1) {
    boolean swapped = true;
    int j = 0;
    Employee tmp;
    while (swapped) {
          swapped = false;
          j++;
          for (int i = 0; i < a1.length - j; i++) {                                       
                if (a1[i].compareTo( a1[i + 1])==1) {                          
                      tmp = a1[i];
                      a1[i] = a1[i + 1];
                      a1[i + 1] = tmp;
                      swapped = true;
                }
          }                
    }
}
/**
 * Bubble Sort will sort by using compare or Comparer and will sort by Last Name
 * @param a1 will be the array with all your Employees
 */
public static void bubbleSortbyName(Employee[] a1) {
    boolean swapped = true;
    int j = 0;
    Employee tmp;
    while (swapped) {
          swapped = false;
          j++;
          for (int i = 0; i < a1.length - j; i++) { 
               
                if (a1[i].compare(a1[i], a1[i + 1])>0) {                          
                      tmp = a1[i];
                      a1[i] = a1[i + 1];
                      a1[i + 1] = tmp;
                      swapped = true;
                }
          }                
    }
     
}
 
}