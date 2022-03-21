import java.util.Scanner;

public class  recursPow{
    public static int pow(int x,int n) {
        if (n==0) {
            return 1;
        }
        int res=pow(x,n-1);
        int xn=x*res;
         return xn;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x^n :");
        System.out.println(pow(sc.nextInt(),sc.nextInt()));
    }
}
