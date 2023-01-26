public class HollowRec{

    public static void main(String[] args) {
        int col= 5;
        int row = 10;
        for(int i= 1;i<=col;i++)
        {
            for (int j=1;j<=row;j++)
            {
                if (i==1 ||i==col||j==1||j==row ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}