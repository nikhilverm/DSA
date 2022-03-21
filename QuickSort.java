import java.util.Scanner;

public class QuickSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int li=0,hi=arr.length-1;
        QuickSort(arr,li,hi);
        for(int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
        public static void QuickSort(int[] arr,int li,int hi){
            if(li<hi){
                int pidx=partition(arr,li,hi);
                QuickSort(arr,li,pidx-1);
                QuickSort(arr,pidx+1,hi);
            }
    }
    public static int partition(int[] arr,int li,int hi){
        int pivot=arr[hi];
        int i=li-1;
        for (int j = li; j<hi; j++) {
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[hi];
        arr[hi]=temp;
        return i;
    }
}
