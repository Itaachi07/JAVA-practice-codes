public class ReverseNum {
    public static void main(String[] args) {
        int num=16854;
        int rev=0;
        while (num!=0) {
            int rem = num%10;
            rev = rev*10+rem;
            num= num/10;
        }
        System.out.println(rev);
    }
}
