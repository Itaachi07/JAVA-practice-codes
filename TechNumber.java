public class TechNumber {
    public static void main(String[] args) {
        int num =2025;
        int temp = num;
        int n1 = temp%100;
        int n2=temp/100;
        int s =n1+n2;
        int s1 = (int)Math.pow(s, 2);
       
        System.out.println(s1 );
        if(num == s1)
        {
            System.out.println(" Tech number");
        } else 
        {
            System.out.println("not a tech number");
        }
    }
}
