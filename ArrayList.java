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
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		  ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
         System.out.println("before removal: " + colors);
        colors.remove(1); // 2nd element (index 1)
        colors.remove("Blue");

        System.out.println("After removal: " + colors);
	}
}

/*3. Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		 
ArrayList<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
         System.out.println("UnSorted colors: " + colors);
        Collections.sort(colors);
        
        System.out.println("Sorted colors: " + colors);
	}
}
/*4. Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		    ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Black");
        colors.add("White");

        List<String> sub = colors.subList(0, 2); // 1st and 2nd
        System.out.println("Sublist (1st and 2nd): " + sub);
	}
}
/*5. Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
  ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("before deleting 3rd element: " + colors);
        int n = 2; // 3rd element (index 2)
        if (n < colors.size()) {
            colors.remove(n);
        }

        System.out.println("After deleting 3rd element: " + colors);
	}
}
