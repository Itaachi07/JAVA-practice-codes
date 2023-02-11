public class StringRemoveSpace {
    public static void main(String[] args) {
       String str = "Hello World , How Are You ?"; 
       String str2 =str;
      str = str.replaceAll("\\s", "");
      //str = str.replaceAll("H", "#");
       System.out.println(str);
       
       str2 = str2.replace(' ', '_');
       System.out.println(str2); //Hello_World_,_How_Are_You_?
    }
}
