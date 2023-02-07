public class StringRemoveSpace {
    public static void main(String[] args) {
       String str = "Hello World , How Are You ?"; 
       str = str.replaceAll("\\s", "");
       System.out.println(str);
    }
}
