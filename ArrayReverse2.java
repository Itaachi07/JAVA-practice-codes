public class ArrayReverse2 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        int arrrev [] = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0 ;i--)
        {
            arrrev[j] = arr[i];
            j++;
        }
        for (int i : arrrev) {
            System.out.print(i+" ");
        }
    }
}
