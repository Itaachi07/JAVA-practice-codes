public class StringCountVandC {
    public static void main(String[] args) {
        String str = "This is Earth. it was Very beautiful planet";

        str =str.toLowerCase();
        System.out.println(str);
        int ccount =0;
        int vcount =0;
        for(int i=0;i<str.length();i++)
        {
            if (str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u' ) {
                vcount++;

            } else {
                ccount++;
            }
        }
        System.out.println("Total vowels are: " +vcount);
        System.out.println("Total consonents are: " +ccount);
    }

}
