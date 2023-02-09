public class ArrayEvenNum {
    public static void main(String[] args) {
        int [] arr = {2,3,5,354,654,36,5,65,654,35,78,6987,961,684,354,654,564};
        for(int i =0;i<arr.length;i++)
        {
            if (arr[i]%2==0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
