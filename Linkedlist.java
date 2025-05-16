/*1c. Linked List Programs

1. Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
     LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Full list: " + list);
        System.out.println("Iterating from 2nd position:");

        Iterator<String> it = list.listIterator(1); // index 1 = 2nd element
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
	}
}
/*2. Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
  LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Original list: " + list);
        System.out.println("Reverse order:");

        Iterator<String> it = list.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
	}
}
/*3. Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
   LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("Before adding at end: " + list);
        list.offerLast("Pink");
        System.out.println("After adding 'Pink' at end: " + list);
        
	}
}
/*4. Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<>();
        list.add("Sakshi");
        list.add("Blue");
        list.add("Yellow");
        list.add("Purple");

        System.out.println("Elements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }
        
	}
}
/*5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Before swapping: " + list);
        Collections.swap(list, 0, 2); // swap 1st and 3rd
        System.out.println("After swapping 1st and 3rd: " + list);
        
	}
}
