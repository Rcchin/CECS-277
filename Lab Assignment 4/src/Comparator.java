import java.util.ArrayList;

public class Comparator 
{
public int Compare(String j,String k)
{
	 if(j.length()==k.length())
		 return 0;
		 else if(j.length()>k.length())
		 return 1;
		 else
		 return -1; 
}
}
