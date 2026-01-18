public class move_zero_to_end {
    public static void main(String[] args) {
        int[] arr={0,1,10,5,0,2};
        movezero(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static void movezero(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==0){
                    swap(arr,i,j);
                }
            }
        }
    }
    static void swap(int[] arr,int a,int b){
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
}
