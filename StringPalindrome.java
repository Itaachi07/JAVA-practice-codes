public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Nitin";
        str =str.toLowerCase();
        String sbr = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            sbr= sbr + str.charAt(i);
        }
       //System.out.println(sbr);
        if(str.equals(sbr))
        {
            System.out.println("Palindrome");
        }else
        System.out.println("not palindrome");

    }
}
