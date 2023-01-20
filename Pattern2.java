public class Pattern2 {
    /*     
     * * * * *
     * * * *
     * * *
     * *
     * 
     */
    public static void main(String[] args) {
        int n =5;
        for (int j=n;j>=1;j--)
        {
            for(int i = 1;i<=j;i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
