public class PrimeNumbersBet {
    public static void main(String[] args) {
        // int n1=10;
        // int n2 =20;
        // int i =0, j=0;
        // for(i=n1;i<=n2;i++)
        // {
        //     for(j=2;j<=i;j++)
        //     {
        //         if(i%j==0)
        //         {
        //             break;
        //         }
        //     }
        //     if (i==j) {
        //         System.out.print(i+" ");
        //     }
        // }

        int n1=20, n2=50;
        int j=0;
        for(int i=n1;i<=n2;i++)
        {
            for( j=2;j<=i;j++)
            {
                if (i%j==0) {
                    break;
                }   
                
            }
            if (i==j) {
                System.out.print(i+ " ");
            }
        }
        
    }
}
