public class Factorialrecursion {
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else{
            return n* fact(n-1);
        }

    }
    public static void main(String[] args) {
        int n =5;
        int f =1;
        f  = fact(n);
        System.out.println(f);
    }
   
}
