public class Pattern3 {
       /*
             *
           * *
         * * *
       * * * *
     * * * * *
     */
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=2*(n-i);j>=0;j--)
            {
                System.out.print(" ");
                
            }
            for(int k=1;k<=i;k++)
                {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}
