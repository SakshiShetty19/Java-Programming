/*1b. Array List programs
1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
package assignment;
import java.util.*;
public class ListOperations {
	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        boolean found = colors.contains("Red");
	        System.out.println("Is Red present? " + found);
	    }
	

}


/*2. Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList*/


/*3. Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/

/*4. Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/

/*5. Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/*/
