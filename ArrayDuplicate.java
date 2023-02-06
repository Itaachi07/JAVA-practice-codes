public class ArrayDuplicate {
    public static void main(String[] args) {
        int []arr={1,2,3,5,7,8,7,6,5,6,8};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++) 
            {
                if (arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
