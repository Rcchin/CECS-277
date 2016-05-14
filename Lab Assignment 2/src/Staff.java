
/**
 * Staff is for the Staff of your company
 * @author Raymond Chin 012754597   
 */
import java.util.*;
 
public class Staff extends Employee
{
    /**
     * @hourlyRate this will be hourly rate for Employee
     */
    int hourlyRate;
    /**
     * This is your constructor to initialize the following
     * @param last last name
     * @param first first name
     * @param id ID number
     * @param s sex(male or female)
     * @param year Year born in
     * @param month month born in
     * @param day day born in
     * @param hr hourly rate
     */
    public Staff(String last,String first,String id,String s,int year,int month,int day,int hr)
    {
        super(last,first,id,s,year,month,day );
        hourlyRate=hr;
    }
    /**
     * gets the Hourly Rate of Employee
     * @return Hourly rate
     */
    public int getHourlyRate()
    {
        return hourlyRate;
    }
    /** 
     *  Changes the Hourly Rate of Employee
     * @param change new Hourly Rate
     */
    public void setHourlyRate(int change)
    {
        hourlyRate=change;
    }
    /**
     * Monthly Earning calculates the Employee's monthly earning
     */
    public double monthlyEarning()
    {
        double monthlySalary=hourlyRate*EmployeeInfo.staff_monthly_hours_worked;
        return monthlySalary;
    }
    /**
     * Displays attributes of class and abstract class Employee
     */
    public String toString()
    {
        return super.toString() + "Full Time\n"+"Monthly Salary: " + monthlyEarning() + "\n";
    }
     
}