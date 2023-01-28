public class PetersonNumber{

    static int fact(int d)
    {
        if (d==0)
        {
        return 1;
        }
        else
        return(d * fact (d-1));
    }
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int  sum =0;
        while (temp>0) {
            int d = temp%10;
            
            sum = sum+ fact(d) ;
            temp=temp/10;
            d=0;
        }
        //System.out.println(sum);
        if (num==sum) {
            System.out.println("It is Peterson Number");
        } 
        else {
            System.out.println("Not a Peterson Number");
        }
    }
}