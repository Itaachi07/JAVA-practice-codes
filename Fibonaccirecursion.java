
public class Fibonaccirecursion {
    static int n1=0, n2=1,n3;
    static void printfab(int count)
     //non-static method printfab(int) cannot be referenced from a static context i.e. from main method
    {
        if(count>0){
        n3= n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            printfab(count-1);
    }
}
    public static void main(String[] args) {
        int n1=0, n2=1,count=10 ;
        System.out.print(n1+" "+n2);

        printfab(count);
    }
}
