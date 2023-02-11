public class ArrayMaxNum {
    public static void main(String[] args) {
        int arr []={15,54,25,84,2,15,35,46,41,56,64,28,52};
        int max = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Biggest number in array is :"+max);
    }
}
