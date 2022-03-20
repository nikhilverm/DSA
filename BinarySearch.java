import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp;
                   temp= arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        System.out.println("Enter the element to be Search: ");
        int n=sc.nextInt();
        int li=0,hi=arr.length-1,avg=(li+hi)/2;
        while (li<=hi){
            if (arr[avg]==n){
                System.out.println("Yes found at index "+avg);
                break;
            }
            else if(arr[avg]<n){
                li=li+1;
            }
            else if (arr[avg]>n){
                hi=hi-1;
            }
            avg=(li+hi)/2;
        }
        if(li>hi){
            System.out.println("Sorry element not found !");
        }
    }
}