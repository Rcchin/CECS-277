
public class Student implements Comparable<Student>
{
	String fname;
	String lname;
	int id;
	public Student(String f,String l,int i)
	{
		fname = f;
		lname = l;
		id = i;
		
	}
	public String getFname()
	{
		return fname;
	}
	public String getLname()
	{
		return lname;
	}
	public int getID()
	{
		return id;
	}
	public void setFname(String n)
	{
		fname = n;
		
	}
	public void setLname(String l)
	{
		lname = l;
		
	}
	public void setID(int i)
	{
		id = i;
		
	}
	public String toString() 
	{
		return fname + " " + lname+ " " +  id;
	}
	@Override 
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if (this.lname.compareTo(s.lname) == 0) {
			if (this.fname.compareTo(s.fname) == 0) {
				return this.id-s.id;
			}
			return this.fname.compareTo(s.fname);
		}
		return this.lname.compareTo(s.lname);
		
	}
	public boolean equals(Student s)
	{
		if(fname.equals(s.fname) && lname.equals(s.lname) && id==s.id)
		{
			return true;
		}
		return false;
	}
	public int hashCode() {
		final int HASH_MULTIPLIER = 29;
		int h = HASH_MULTIPLIER * fname.hashCode() + lname.hashCode();
		h = HASH_MULTIPLIER * h + ((Integer) id).hashCode();
		return h;
	}

	

}
