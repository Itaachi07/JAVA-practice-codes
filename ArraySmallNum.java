public class ArraySmallNum {
    public static void main(String[] args) {
        int arr[] ={5641,654,245,564,1344,541,1358,6498,5965,156,51,648,54,12,35,458};
        int snum =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (arr[i]<snum) {
                snum = arr[i];
            }
        }
        System.out.println("smallest number in the array is : "+snum);

    }
}
