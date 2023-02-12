public class StringReverse1 {
    public static void main(String[] args) {
        String str ="Hello there!";
        String str2=" ";
        for(int i =str.length()-1;i>=0;i--)
        {
            str2 = str2+ str.charAt(i);         //Storing in new string
            System.out.print(str.charAt(i));  // Direct loop 
        }
        System.out.println();
        System.out.println("str2 = "+str2);
    }
}
