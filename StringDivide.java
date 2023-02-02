public class StringDivide {
    public static void main(String[] args) {
        String s = "This is Earth, Hello Earth.";

        int len = s.length();
        //System.out.println(len);
        int n=3, chars = len/n;
        int temp =0;
        String [] str = new String [n];
        if (len%n!=0) {
            System.out.println("cannot divide String");
        } else {
               for(int i = 0;i<len;i=i+chars)
               {
                String part = s.substring(i, i+chars);
                str[temp] = part;
                temp++;
               } 
               for(int i = 0; i<str.length;i++)
               {
                System.out.println(str[i]);
               }
        }
    }
}
