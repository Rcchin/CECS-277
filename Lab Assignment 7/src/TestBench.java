import java.util.*;
import java.io.*;
import java.util.Map.*;
/**
 * Runs a program that checks the frequency of words in text document
 * 
 * @author Raymond Chin 012754597
 *
 */
public class TestBench
{
 public static void main(String [] args) throws FileNotFoundException
 {
  
  System.out.println("Welcome! Are you ready? Start!!");
  displayInfo();

 }
 public static TreeMap insert(Scanner in)throws FileNotFoundException
 {
  TreeMap<String,Integer> m = new TreeMap<>();
  while(in.hasNext())
  {
   int value = 1;
   String word = in.next().toLowerCase();
   if(!m.containsKey(word)) {
    m.put(word, value);
   }   
   else {
    m.put(word,(m.get(word))+1);
   }
   
  }
  return m;

 }
 public static void displayInfo()
 {
  try
  {
   Scanner input = new Scanner(new File("data.txt"));
   TreeMap<String,Integer> words = insert(input);
   
   int max = Collections.max(words.values());
   System.out.println("Word: " + "Occurences");
   for(Entry<String,Integer> i:words.entrySet())
   {
    System.out.println(i.getKey() + " " + i.getValue());
   }
   System.out.println("The word that appears the most is: ");
   for(Entry<String, Integer> i : words.entrySet())
   {
    if(i.getValue()==max)
    {
     System.out.println(i.getKey() +" appearing "+  i.getValue() + " times!");
    }
     

   }
  
  }catch(FileNotFoundException e){
   System.out.println("Error could not find file!");

  }
 }


}