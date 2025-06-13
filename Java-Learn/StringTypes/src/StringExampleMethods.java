public class StringExampleMethods {
    public static void main(String[] args) {
        String name = "Luis Vazquez";
        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals() = " + name.equals("Luis Vazquez"));
        System.out.println("name.equalsIgnoreCase() = " + name.equalsIgnoreCase("luis vazquez"));
        System.out.println("name.charAt(0) = " + name.compareTo("Luis Vazquez")); // Compares lexicographically
        System.out.println("name.charAt(0) = " + name.charAt(0)); // Returns the character at the specified index
        System.out.println("name.substring(0, 4) = " + name.substring(0, 4)); // Returns a substring from index 0 to 4

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf('a')); // Returns the index of the first occurrence of 'a'
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a")); // Returns the index of the last occurrence of 'a'
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a")); // Checks if 'a' is present in the string
        System.out.println("trabalenguas.startsWith(\"tra\") = " + trabalenguas.startsWith("tra")); // Checks if the string starts with "tra"
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as")); // Checks if the string ends with "as"
        System.out.println("trabalenguas.trim() = " + " trabalenguas ".trim()); // Removes leading and trailing whitespace
    }
}