/**
 * Faculty will be for Faculty of your company
 * @author Raymond Chin 012754597
 *
 */
 
public class Faculty extends Employee
{
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
    public Faculty(String last,String first,String id,String s,int year,int month,int day,Level fu,String d,String m,int r)
    {
        super(last,first,id,s,year,month,day);
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
        return super.toString() + "Level: " + position + "\n" + "Degree: "  + e.getDegree() + "\n" + "Major: " + e.getMajor() + "\n" + "Research: " + e.getReserch() + "\n" + "Monthly Salary: "+ monthlyEarning() + "\n";
    }
    /**
     * clones objects b and e. 
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
}
 
