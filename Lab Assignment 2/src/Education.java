/**
 * Education is class for Employee's Education they received and what they have done
 * @author Raymond Chin 012754597   
 *
 */
 
public class Education implements Cloneable
{
    /**
     * @degree This is the degree they received from college
     */
    String degree;
    /**
     * @major This is what they majored in college
     */
    String major;
    /**
     * @research How many research projects they have done
     */
    int research;
    /**
     * constructor for Education initializes degree,major,and research
     * @param d Degree
     * @param m Major
     * @param r Research
     */
    public Education(String d, String m, int r)
    {
        degree = d;
        major  = m;
        research = r;
         
    }
    /**
     * Gets the Degree the Employee received
     * @return Degree(Bachelors,PH.D etc)
     */
    public String getDegree()
    {
        return degree;
    }
    /**
     * Gets Major of Employee
     * @return Major(Computer Science,Biology, English, etc)
     */
    public String getMajor()
    {
        return major;
    }
    /**
     * Gets the number of Research Projects the person has done
     * @return Number of Research Projects (1,2,3, etc)
     */
    public int getReserch()
    {
        return research;
    }
    /**
     * Changes and Employee's Degree
     * @param change Degree you want to replace the current one with
     */
    public void setDegree(String change)
    {
        degree=change;
    }
    /**
     * Changes the Major of an Employee
     * @param change Major you want to replace the current one with
     */
    public void setMajor(String change)
    {
        major = change;
    }
    /**
     * Changes the number of Research Projects
     * 
     * @param change number you want to replace the current one with
     */
    public void setResearch(int change)
    {
        research = change;
    }
    /**
     * clone is here to just clone b. Also if equals doesn't work then use this one instead of the one in Faculty
     * 
     */
    public Object clone() throws CloneNotSupportedException
    {
    Education b = (Education) super.clone();
        /*
        b.setMajor(major);
        b.setDegree(degree);
        b.setResearch(research);
         */
        //if equals doesnt work out comment
    return b;
     
    }
    /**
     * @Override
     * Changes the equal fucntion to compare Employee's degree, major, and research. This to make sure clone() has worked and cloned two objects 
     * succesfully. 
     * @param o1 Object to compare with implicit.
     */
    public boolean equals(Object o1)
    {
        Education e = (Education)o1;
        if(this.degree.equals(e.degree) && this.major.equals(e.major) && this.research==e.research)
        {
            return true;
        }
        else
            return false;
    }
}