import java.util.Scanner;
class Sorting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array!");
        int[] arr=new int[sc.nextInt()];
        //int flag=0;
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        //Insertion sort
        for(int i =1; i <arr.length ; i++){
            int current=arr[i];
            int j=i-1;
            while (current<arr[j] && j>=0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        // Selection sort
        for (int i = 0; i <arr.length; i++) {
            int smallest=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[smallest]<arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        // bubble sort
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
