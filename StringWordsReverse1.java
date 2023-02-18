public class StringWordsReverse1 {
    public static void main(String[] args) {
        String str = "My name is Ash";
        String [] words = str.split(" ");
        String reverseword = "";
        for(String w:words)
        {
            StringBuffer sb = new StringBuffer(w);
            sb.reverse();
            reverseword += sb.toString() + " ";
        
        }
        System.out.println(reverseword);
    }
}
