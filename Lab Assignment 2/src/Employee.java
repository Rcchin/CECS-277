
/**
 * This will be your parent class for Employee's. Will have all the basic attributes that every Employee should have.
 * @author Raymond Chin 012754597   
 */
import java.util.*;
 
public abstract class Employee implements Cloneable,Comparator<Object>,Comparable<Object>
{
    /**
     * @lastName last name of Employee
     */
    String lastName;
    /**
     * @firstName first name
     */
    String firstName;
    /**
     * @idNum ID number
     */
    String idNum;
    /**
     * @sex sex(male or female)
     */
    String sex;
    /**
     * @bDay will be object for date of birth of Employees
     */
    Calendar bDay = new GregorianCalendar();
 
//constructor
    /**
     * this will be your constructor for class
     * @param last last name
     * @param first first name
     * @param id id number
     * @param s sex(male or female)
     * @param year year born in 
     * @param month month born in 
     * @param day day born on
     */
public Employee(String last,String first,String id,String s,int year, int month,int day)
{
    lastName=last;
    firstName = first;
    idNum = id;
    sex = s;
    bDay.set(Calendar.YEAR,year);
    bDay.set(Calendar.MONTH,month);
    bDay.set(Calendar.DAY_OF_MONTH,day);
}
 
 
//methods
//comparable
/**
 * @Override
 * This will be your comparable and will no compare by object ID Number 
 */
public int compareTo(Object obj)//ID
{
    Employee e = (Employee)obj;
    int e2 = Integer.parseInt(e.getIDNum());
    int e1 = Integer.parseInt(this.idNum);
     
     if(e1<e2)
     return 1;
     else
     return -1;
}
//comparator
/**
 * @Override
 * This will be your comparator and it will compare by object Last Name
 */
public int compare(Object o1,Object o2)//Last Name
{
    Employee e1 =(Employee)o1;
    Employee e2 =(Employee)o2;
     
    return e1.lastName.compareTo(e2.lastName);
     
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
public String getIDNum()
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
public void setID(String change)
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
/**
 * This will display all important attributes of this class.
 */
public String toString()
{
    return "ID Employee number: " + idNum + "\n" + "Employee Name: " +  lastName+" "+firstName + "\n" + "Birth Date: " + bDay.get(Calendar.MONTH)+" / "+bDay.get(Calendar.DAY_OF_MONTH)+" / "+bDay.get(Calendar.YEAR) + "\n";
}
/**
 * This is will be your abstract method that will be used in child classes
 * @return monthly earning of employee
 */
public abstract double monthlyEarning();
}