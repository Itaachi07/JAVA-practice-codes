import java.util.Arrays;

public class Array2LargNum {
    public static void main(String[] args) {
        int arr []={65,6,5,6,94,65,95,3,54,74,32,98};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Second largest number: "+arr[arr.length-2]);
    }
}
