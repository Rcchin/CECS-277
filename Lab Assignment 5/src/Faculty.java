import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

/**
 * Faculty will be for Faculty of your company
 * @author Raymond Chin 012754597
 *
 */

public class Faculty implements EmployeeInfo, Comparable<Faculty>
{
 String lastName;
 String firstName;
 int idNum;
 String sex;
 Calendar bDay = new GregorianCalendar();
 /**
  * @position This will be the Employee's position in the company
  */
 Level position;
 /**
  * @e highest education received
  */
 Education e;
 /**
  * @monthlySalary employee's monthly salary
  */
 int monthlySalary;
 /**
  * Constructor for Faculty will initialize values for class
  * @param last last name
  * @param first first name
  * @param id ID number
  * @param s sex(Male or Female)
  * @param year year they were born in 
  * @param month month they were born in 
  * @param day day they were born 
  * @param fu position in company
  * @param d degree they received from college
  * @param m what they majored in
  * @param r research projects they have done
  */
 public Faculty(String last,String first,int id,String s,int year,int month,int day,Level fu,String d,String m,int r)
 {
  lastName=last;
  firstName = first;
  idNum = id;
  sex = s;
  bDay.set(Calendar.YEAR,year);
  bDay.set(Calendar.MONTH,month);
  bDay.set(Calendar.DAY_OF_MONTH,day);
  this.position=fu;
  e= new Education(d,m,r);
 }
 
 //methods
 
 /**
  * Finds the how much the employee earns each month. Dependent on position on company as well.
  * @return returns Employees Monthly earnings
  */
 public double monthlyEarning()
 {
  switch(position)
  {
  case AS: 
   return EmployeeInfo.faculty_monthly_salary;
   
  case AO:
   return EmployeeInfo.faculty_monthly_salary*1.2;
  
   
   
  case FU:
   return EmployeeInfo.faculty_monthly_salary*1.4;
  
  default:
   System.out.println("There's a PROBLEM OVER HERE!(Facutly Class->monthlyEarning!");
   return 0;
  
   
  }
  
 }
 /**
  * Displays everything important for this class in particular. Uses super to display everything important from Employee
  * In particulart it displays position,degree,major,and research
  */
 public String toString()
 {
	 return "ID Employee number: " + idNum + "\n" + "Employee Name: " +  firstName+" "+lastName + "\n" + "Birth Date: " + bDay.get(Calendar.MONTH)+" / "+bDay.get(Calendar.DAY_OF_MONTH)+" / "+bDay.get(Calendar.YEAR) + "\n"
 + "Level: " + position + "\n" + "Degree: "  + e.getDegree() + "\n" + "Major: " + e.getMajor() + "\n" + "Research: " + e.getReserch() + "\n" + "Monthly Salary: "+ monthlyEarning() + "\n";
 }
 /**
  * clones objects b and e. They are from 2 different classes. 
  * @return returns object from Faculty
  */
 public Object clone() throws CloneNotSupportedException
 {
  Faculty b = (Faculty) super.clone();
  e = (Education) e.clone();
  b.setE(e);
 
  return b;
 }
 /**
  * get position of Employee
  * @return AS,AO, FU
  */
 public Level getPosition() {
  return position;
 }
 /**
  * set position changes the position of Employee
  * @param Position you want it changed too
  */
 public void setPosition(Level position) {
  this.position = position;
 }
 /**
  * Gets Education of Employee
  * @return Education could be PH.D or Bachelors
  */
 public Education getE() {
  return e;
 }
 /**
  * Changes Education of Employee 
  * @param Education you want it changed too
  */
 public void setE(Education e) {
  this.e = e;
 }
 /**
  * gets the Monthly Salary
  * @return Monthly Salary of Employee
  */
 public int getMonthlySalary() {
  return monthlySalary;
 }
 /**
  * Changes the monthly salary of Employee
  * @param monthlySalary salary you want it changed too
  */
 public void setMonthlySalary(int monthlySalary) {
  this.monthlySalary = monthlySalary;
 }
 /**
  * @Override
  * Changes the equals function to compare 2 objects. Tests Clone method to make sure it works
  * @return return true or false.
  */
 public boolean equals(Object o1)
 {
  Faculty f = (Faculty)o1;
  if(this.e.equals(f.e))
  {
   return true;
  }
  else
  {
   return false;
  }
 }
 /**
  * This will get Last Name of Employee
  * @return last name
  */
 public String getLastName()
 {
  return lastName;
 }
 /** this will get the first name of Employee
  * 
  * @return first name
  */
 public String getFirstName()
 {
  return firstName;
 }
 /**
  * This will get ID number of Employee
  * @return ID number
  */
 public int getIDNum()
 {
  return idNum;
  
 }
 /** 
  * This will get the sex of Employee
  * @return Male or Female
  */
 public String getSex()
 {
  return sex;
 }
 /**
  * This will get the Birthday of Employee
  * @return mm/dd/yyyy
  */
 public String getBday()
 {
  int year=bDay.get(Calendar.YEAR);
  int month=bDay.get(Calendar.MONTH);
  int day=bDay.get(Calendar.DAY_OF_MONTH);
  return String.valueOf(month) + "/" + String.valueOf(day) + "/" + String.valueOf(year); 
  
 }
 /**
  * will change the last name of Employee
  * @param change Last name desired
  */
 public void setLastName(String change)
 {
  lastName=change;
 }
 /**
  * will change the first name of Employee
  * @param change first name desired
  */
 public void setFirstName(String change)
 {
  firstName=change;
 }
 /**
  * will change the ID number of Employee
  * 
  * @param change ID number desired
  */
 public void setID(int change)
 {
  idNum = change;
 }
 /**
  * will change the sex of Employee
  * @param change sex desired(male or female)
  */
 public void setSex(String change)
 {
  sex = change;
 }
 /**
  * will change the Birthday of Employee
  * @param month the month desired
  * @param day day desired
  * @param year year desired
  */
 public void setBday(int month,int day,int year)
 {
  bDay.set(Calendar.MONTH,month);
  bDay.set(Calendar.DAY_OF_MONTH,day);
  bDay.set(Calendar.YEAR,year);
  
 }
 public int compareTo(Faculty f) 
 {
  return this.idNum - f.idNum; 
 }
 

}
