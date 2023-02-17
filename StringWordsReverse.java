public class StringWordsReverse {
    public static void main(String[] args) {
        String str ="Hello World";
        String[] words = str.split(" ");
        String reverse = "";
        for(String w:words)
        {
          String revwords = " ";
          for(int i=w.length()-1;i>=0;i--)
          {
            revwords = revwords +w.charAt(i);
          }
          reverse = reverse + revwords + " ";
        }
        System.out.println(reverse);
    }
}
