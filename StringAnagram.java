import java.util.Arrays;

public class StringAnagram {
    
    public static void main(String[] args) {
        String str1 = "Brag";
        String str2 = "Grab";
        str1= str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()==str2.length())
        {
            char [] string1 = str1.toCharArray();
            char [] string2 = str2.toCharArray();
           
            Arrays.sort(string1);
            Arrays.sort(string2);
          if (Arrays.equals(string1, string2)) {
            System.out.println( "Anagram");
          } else {
            System.out.println("not anagram");
          }
        }
        else
        {
            System.out.println("not anagram");
        }
    }
}
