import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";

        //CharAt()
        System.out.println(str.charAt(4));

        //Contains
        System.out.println(str.contains("Hello"));

        //Equals
        String str1 = "Hello world";
        if(str.equals(str1)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }

        //Equals Ignore Case
        if(str.equalsIgnoreCase(str1)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }

        //IndexOf
        System.out.println(str.indexOf('W'));

        //Last IndexOf
        System.out.println(str.lastIndexOf('o'));

        //Replace
        String replace = str.replace('H','h');
        System.out.println(replace);

        //Concat
        String concat = str.concat("\t in Java");
        System.out.println(concat);

        //Ends with
        boolean ends = str.endsWith("d");
        System.out.println(ends);

        //uppercase
        System.out.println(str.toUpperCase());

        //lowercase
        System.out.println(str.toLowerCase());

        //startswith
        boolean start = str.startsWith("java");
        System.out.println(start);
        boolean startwith = str.startsWith("Hello");
        System.out.println(startwith);

        //strip
        String string = "          Hello world  !!!!         ";
        System.out.println(string);
        String strip = string.strip();
        System.out.println(strip);
        String leading  = string.stripLeading();
        String trailing = string.stripTrailing();
        System.out.println(leading);
        System.out.println(trailing);

        //trim
        String trim = string.trim();
        System.out.println(trim);

        //split
        String split[] = str.split("l",4);
        for (String string1 : split)
             System.out.println(string1);
    }
}