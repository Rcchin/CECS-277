
/**
 * Partime will be subclass of Employee. This particular one will be for Partime Employees
 * @author Raymond Chin 012754597   
 *
 */
 
public class Partime extends Staff 
{
    /**
     * @hoursWorkedPerWeek this will be the amount of hours the employee works each week
     */
    int hoursWorkedPerWeek;
    
    /**
     * This will be your constructor for Partime.
     * @param last This will be their last name
     * @param first This will be their first name
     * @param id this will be id number
     * @param s sex(male or female)
     * @param year year they were born in 
     * @param month month they were born in
     * @param day day they were born in 
     * @param hourRate how much they earn each hour
     * @param hpw how much they worked each week
     */
    public Partime(String last,String first,String id,String s,int year,int month,int day,int hourRate,int hpw)
     
    {
        super(last, first, id, s,year,month,day, hourRate);
        hoursWorkedPerWeek = hpw;
    }
    /**
     * This will give the integer value of how many hours the Employee worked that week
     * @return integer value of hours worked that week
     */
    public int getHoursWorkedPerWeek()
    {
        return hoursWorkedPerWeek;
    }
    /**
     * This will change the integer value of hours the employee works in a week
     * @param change the new amount of hours per week
     */
    public void settHoursWorkedPerWeek(int change)
    {
        hoursWorkedPerWeek = change;
    }
    /**
     * Monthly Earning will calculate how much the employee earns each month
     */
    public double monthlyEarning()
    {
        return  hoursWorkedPerWeek *super.hourlyRate* 4;
    }
    /**
     * Displays last name, first name, ID number, sex(male or female), Birthday, hour per week, and monthly salary for that Employee
     */
    public String toString()
    {
        return super.toString()  + "\n" + "Hours worked per Week: " + hoursWorkedPerWeek + "\n" + "Monthly Salary: " + monthlyEarning() + "\n";
    }
}