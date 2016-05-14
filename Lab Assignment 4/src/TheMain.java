import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TheMain 
{
	 
public static void main(String args[] )
{
	ArrayList<String> breakfast=new ArrayList<String>();
	breakfast.add("Apple");
	breakfast.add("Ham");
	breakfast.add("Coke");
	breakfast.add("Cereal");
	breakfast.add("Oatmeal");
	Collections.sort(breakfast,new StringComparator());
	System.out.println(breakfast);
}

}