import java.util.ArrayList;

public class StringSubsets {
    public static void main(String[] args) {
        String str = "fun";
        int i =0;
        int len = str.length();
        ArrayList <String> al = new ArrayList<String>();

        for(i=0; i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
                String sub = str.substring(i, j+1);
                al.add(sub);
            }
        }
        for (Object c  : al) {
            System.out.println(c);
        }

    }
}
