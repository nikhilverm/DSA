import java.util.Scanner;
class MergeSort{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of Array");
       int[] arr=new int[sc.nextInt()];
       for (int i = 0; i <arr.length ; i++) {
           arr[i]=sc.nextInt();
       }
      int li=0;
      int hi=arr.length-1;
       devide(arr,li,hi);
       for (int i = 0; i <arr.length ; i++) {
           System.out.println(arr[i]);
       }
   }
   public static void devide(int arr[],int li,int hi){
       if(li>=hi){
           return;
       }
      int mid=li+(hi-li)/2;
      devide(arr,li,mid);
      devide(arr,mid+1,hi);
      conquer(arr,li,mid,hi);
   }
   public static void conquer(int arr[],int li,int mid,int hi ) {
       int[] DupliArr = new int[hi - li + 1];
       int idx1 = li;
       int idx2 = mid + 1;
       int x = 0;
       while (idx1 <= mid && idx2 <= hi) {
           if (arr[idx1] < arr[idx2]) {
               DupliArr[x++] = arr[idx1++];
           } else {
               DupliArr[x++] = arr[idx2++];
           }
       }
       while (idx1 <= mid) {
           DupliArr[x++] = arr[idx1++];
       }
       while (idx2 <= hi) {
           DupliArr[x++] = arr[idx2++];
       }
       for (int i =0,j=li; i < DupliArr.length ; i++,j++) {
           arr[j]= DupliArr[i];
       }
   }
}
