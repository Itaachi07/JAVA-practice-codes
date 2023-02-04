public class Pattern4 {
    
    public static void main(String[] args) {
        int i =0, j=0;
    int row = 5  ;
    for(i=0;i<row;i++)
    {
        for(j=row-i;j>1;j--)
        {
            System.out.print(" ");
        }
        for(j=0;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
