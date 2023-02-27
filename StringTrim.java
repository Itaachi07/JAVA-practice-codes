
//The trim() method in Java String is a built-in function that eliminates leading and trailing spaces.
//he trim() method doesn’t eliminate middle spaces.

public class StringTrim {
    public static void main(String[] args) {
        String str = "   Hello There! How are you   ";
        System.out.println(str.trim()); //"Hello There! How are you"
    }
}
