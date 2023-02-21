public class Pattern4 {
    
    public static void main(String[] args) {
        int i =0, j=0;
    int row = 5  ;
    for(i=1;i<=row;i++)
    {
        for(j=row;j>i;j--)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
