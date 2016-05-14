/**
 * @author Raymond Chin 012754597
 * This will be the main of the program and run the code.
 */
import java.util.*;
public class Test 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int choice = 0;
		Map<Integer,Student> student = new TreeMap<Integer,Student>();
		Map<Student,String> grade = new TreeMap<Student,String>();
		Set<Student> sHash = new HashSet<Student>();

		while(choice!= 5)
		{
			printMenuAndGetChoice();
			choice = input.nextInt();
			if(choice==1)
			{
				add(student,grade);
			}
			if(choice==2)
			{
				remove(student,grade);
			}
			if(choice==3)
			{
				modify(student,grade);
			}
			if(choice==4)
			{
				print(grade);
			}
			if(choice==5)
			{
				System.out.println("Have a nice day!");
			}
		}

	}
	/**
	 * This will add a student and a grade to StudentMap and GradeMap respectively
	 * @param StudentMap will contain your students with ID as the key and object as value
	 * @param GradeMap will contain the grade for you. Student object will be key grade value
	 */
	public static void add(Map<Integer,Student> StudentMap, Map<Student,String>GradeMap)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("You will now be enrolling a student!");
		System.out.println("Please enter first name of student: ");
		String firstName = input.next();
		System.out.println("Please enter last name of student: ");
		String lastName = input.next();
		System.out.println("Please enter ID number of student: " );
		int idNum = input.nextInt();
		System.out.println("Enter the student's grade(A-F): ");
		String grade = input.next();
		System.out.println("Student " + firstName+ " " + lastName+ " " + idNum + " has been added.");
		while(StudentMap.containsKey(idNum))
		{
			System.out.println("Error Student with ID already exists");
			System.out.println("Please try again!");
			idNum=input.nextInt();
		}
		Student s = new Student(firstName,lastName,idNum);

		StudentMap.put(s.getID(),s);
		GradeMap.put(s, grade);

	}
	/**
	 * prints the menu and choices 
	 */
	public static void printMenuAndGetChoice()
	{
		System.out.println("1. Enroll a Student");
		System.out.println("2. Expell a Student");
		System.out.println("3. Change grade"); 
		System.out.println("4. Display Student Body");
		System.out.println("5. Exit");

	}
	/**
	 * removes Student from StudentMap and GradeMap
	 * @param StudentMap
	 * @param GradeMap
	 */
	public static void remove(Map<Integer,Student> StudentMap, Map<Student,String>GradeMap)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Which student would you like to expell?(Please enter ID Number)");
		int idNum = input.nextInt();
		GradeMap.remove(StudentMap.get(idNum));
		StudentMap.remove(idNum);


	}
	/**
	 * Modifies grade of student
	 * @param StudentMap Whole student body Student is value ID num is key
	 * @param GradeMap All grades Grade is value Student object key
	 */
	public static void modify(Map<Integer,Student>StudentMap, Map<Student,String>GradeMap)
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the ID number of the student you will be modifying: ");
		int idNum = input.nextInt();
		while (!StudentMap.containsKey(idNum))
		{
			System.out.println("Student doesn't exist!");
			System.out.println("Please enter ID Num");
			idNum=input.nextInt();
		}
		System.out.println("What is the new grade?");
		String nGrade = input.next();
		GradeMap.put(StudentMap.get(idNum),nGrade);

	}
	/**
	 * This will print the whole student body in the Map
	 * @param GradeMap GradeMap is the map with all Grades and Students as keys Grades as values
	 */
	public static void print(Map<Student,String>GradeMap)
	{
		Set<Student> studentList = GradeMap.keySet();
		for(Student s: studentList)
		{
			System.out.println(s.toString()+ " " + GradeMap.get(s));
		}
	}

}
