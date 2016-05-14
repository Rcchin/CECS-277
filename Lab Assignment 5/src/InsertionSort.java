public class InsertionSort<T extends Comparable<T>>
{
 
public static <T> void insertionSort(T[] theArray)
{

for (int unsorted = 1; unsorted < theArray.length; ++unsorted) {

 T nextItem = theArray[unsorted];
 int loc = unsorted;
 while ((loc > 0) &&
 (((Comparable<T>) theArray[loc-1]).compareTo(nextItem) > 0)) {

 theArray[loc] = theArray[loc-1];
 loc--;
 }
 theArray[loc] = nextItem;
 } 
 } 
}