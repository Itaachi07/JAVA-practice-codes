public class ArrayLeftRotate {
    public static void main(String[] args) {
        int n =3;
        int[]arr={1,2,3,4,5,6};
        int [] temp = new int [arr.length];
        int j = 0 ; 
        for (int i=n;i<arr.length;i++)
        {
            temp[j] = arr[i];
            j++;
        }
        System.out.println(j);
        for(int i=0;i<n;i++)
        {
            temp[j] = arr[i];
            j++;
        }
        for (int i : temp) {
            System.out.print(i+" ");
        }
    }
    
}
