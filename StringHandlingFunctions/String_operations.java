/*3a. Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/

public class StringOperations {

    public static void main(String[] args) {

        // String Creation and Basic Operations
        String str = "Sakshi";
        String a = new String("Computer Science");
        System.out.println("String 1: " + str);
        System.out.println("String 2: " + a);

        // Length and Character Access
        System.out.println("Length of str: " + str.length());
        System.out.println("Character at index 2 in str: " + str.charAt(2));

        // String Comparison
        String b = "Sakshi";
        System.out.println("str equals b: " + str.equals(b));
        System.out.println("str equalsIgnoreCase 'sakshi': " + str.equalsIgnoreCase("sakshi"));
        System.out.println("str compareTo a: " + str.compareTo(a));

        // String Searching
        String c = "Sakshi studies at Alvas Institute";
        System.out.println("Index of 'Alvas': " + c.indexOf("Alvas"));
        System.out.println("Contains 'Sakshi': " + c.contains("Sakshi"));

        // Substring Operations
        System.out.println("Substring from index 8: " + c.substring(8));
        System.out.println("Substring from index 0 to 6: " + c.substring(0, 6));

        // String Modification
        String d = c.replace("Alvas", "MIT");
        System.out.println("After replacing: " + d);
        System.out.println("To Uppercase: " + c.toUpperCase());
        System.out.println("To Lowercase: " + c.toLowerCase());

        // Whitespace Handling
        String e = "   Hello Sakshi   ";
        System.out.println("Original with spaces: '" + e + "'");
        System.out.println("After trim: '" + e.trim() + "'");

        // String Concatenation
        String f = str + " is learning " + a;
        System.out.println("Concatenated using '+': " + f);
        System.out.println("Concatenated using concat(): " + str.concat(" is learning ").concat(a));

        // String Splitting
        String g = "Java is interesting and challenging";
        String[] h = g.split(" ");
        System.out.println("Split words:");
        for (String word : h) {
            System.out.println(word);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Sakshi");
        sb.append(" Rocks");
        sb.insert(6, " really");
        sb.replace(0, 6, "She");
        sb.delete(3, 4);
        System.out.println("StringBuilder result: " + sb.toString());

        // String Formatting
        String i = "Sakshi";
        int j = 20;
        String k = String.format("Name: %s, Age: %d", i, j);
        System.out.println("Formatted String: " + k);

        // Validate Email with contains(), startsWith(), endsWith()
        String email = "sakshi@alvas.edu";
        boolean valid = email.contains("@") && email.startsWith("sakshi") && email.endsWith(".edu");
        System.out.println("Email: " + email);
        System.out.println("Is email valid? " + valid);
    }
}
