public class insertionsort {
    public static void main(String[] args) {
        int[] arr={2,1,4,5,9,7};
        insertion(arr);
        for(int val: arr){
            System.out.print(val+" ");
        }

    }
    static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
    }
    static void swap(int[] arr,int a,int b){
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];

    }
}
