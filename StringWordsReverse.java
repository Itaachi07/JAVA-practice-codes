public class StringWordsReverse {
    public static void main(String[] args) {
        String str ="Hello World";
        String[] words = str.split(" ");
        for(int i = 0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
    }
}
