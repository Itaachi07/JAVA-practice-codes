public class Practice {
    public static void main(String[] args) {
        int n =6;
        for(int y=1;y<=n;y++)
        {
            for(int x=n;x>y;x--)
            {
                System.out.print(" ");
            }
            for(int x =1;x<=y;x++)
            {
            System.out.print("* ");
            }
            System.out.println();
        }
    }
}
