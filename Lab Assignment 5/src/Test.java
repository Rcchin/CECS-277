import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
 public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  int numInput = 0;
  
  Faculty f1 = new Faculty("Johnson","Anne",243,"F",1962,4,27,Level.FU,"Ph.D","Engineering",3);
  Faculty f2 = new Faculty("Bouris","William",791,"F",1975,3,14,Level.AO,"Ph.D","English",1);
  Faculty f3 = new Faculty("Andrade","Christopher",623,"F",1980,5,2,Level.AS,"MS","Physical Education",0);
  
  Faculty[] facultyObjects = {(Faculty) f1, (Faculty) f2, (Faculty) f3};
  
  InsertionSort.insertionSort(facultyObjects);
  
  BinarySearcher searchFaculty= new BinarySearcher(facultyObjects);
  
  System.out.println("Sorted by ID Numbers: ");
  for (int i = 0; i < facultyObjects.length; i++) 
  {
   System.out.println("ID: " + facultyObjects[i].getIDNum());
   System.out.println("Name: " + facultyObjects[i].getFirstName() +  " " + facultyObjects[i].getLastName() );
  }
  
  System.out.println("Enter the ID Number you're searching for: ");
  
  numInput = input.nextInt();
  
  Faculty searching =  new Faculty("Cat","Happy",numInput,"F",1962,4,27,Level.FU,"Ph.D","Magic",3);
  if(searchFaculty.search(searching)!=-1)
  {
  System.out.println("The index of " + numInput + " is: " + searchFaculty.search(searching));
  System.out.println(facultyObjects[searchFaculty.search(searching)].toString());
  }
  if(searchFaculty.search(searching)==-1)
  {
	System.out.println("Faculty member not found!");
  }
  
  ArrayList<Integer> userNumber = new ArrayList<Integer>();
  
  
  System.out.println("Now lets search a list of user input.");
  System.out.println("Please enter your numbers. Enter \"-1\" to stop.");
  
  int num = input.nextInt();
  
  while(num != -1) 
  {
   userNumber.add(num);
   num = input.nextInt();
  }
  
  Integer[] numbers = new Integer[userNumber.size()];
  
  for (int i = 0; i < numbers.length; i++) 
  {
   numbers[i] = userNumber.get(i);
  }
  
  InsertionSort.insertionSort(numbers);
  
  BinarySearcher searchNumbers = new BinarySearcher(numbers);
  
  System.out.println("What number you want to search for: ");
  
  num = input.nextInt();
  
  System.out.println("The index of " + num + " is: " + searchNumbers.search(num));
 }
}
