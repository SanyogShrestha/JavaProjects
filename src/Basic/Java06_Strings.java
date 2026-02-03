package Basic;

public class Java06_Strings {
    public static void main(String[] args) {
        //A String variable contains a collection of characters surrounded by double quotes (""):
        //A String in Java is actually an object, which means it contains methods that can perform certain operations on strings.

        String txt = "You are learning great!!";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("are"));
        System.out.println(txt.charAt(0));
        System.out.println(txt.charAt(4));

        String txt1 = "Nepal";
        String txt2 = "Nepal";

        String txt3 = "USA";
        String txt4 = "Is Amazing";

        System.out.println(txt1.equals(txt2));
        System.out.println(txt3.equals(txt4));

        String txt5 = "   Gen-z Protest   ";
        System.out.println("Before: [" + txt5 + "]");
        System.out.println("After:  [" + txt5.trim() + "]");

        // The + Operator used to to combined them. "Concatenation"
        String firstName = "Sanyog";
        String lastName = "Shrestha";
        System.out.println("Full Name: " + firstName + " " + lastName + "\nHe lives in " + txt1);
        int age = 25;
        System.out.println("My name is " + firstName + " and I am " + age + " years old.");
        System.out.println(firstName.concat(lastName));
        String a = "Java ";
        String b = "is ";
        String c = "fun!";
        String result = a.concat(b).concat(c);
        System.out.println(result);

        // '+' = Numbers are added. Strings are concatenated.
        int d = 20;
        String e = "26";
        System.out.println(d + e);

        String txt6 = "We are Learning \"Java\" from my repo \\ Also Making Projects.";
        System.out.println(txt6);



    }
}
