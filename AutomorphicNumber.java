public class AutomorphicNumber {
    static boolean isAutomorphic(int num)
    {
        int sq = num * num;
        while(num!=0)
        {
            if (num%10 != sq%10) 
                return false;
                num = num/10;
                sq = sq/10;            
        }
        return true;

    }
    public static void main(String[] args) {
        int num = 25;
        System.out.println(isAutomorphic(num)?"is automorphic":"Not Automorphic");
    }
}
