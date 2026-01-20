public class Quick_sort {
    public static void main(String[] args) {
        int[] arr={3,5,2,6,7,8,9,0};
        System.out.println("Array before sorting ");
        display(arr);
        System.out.println();
        quicksort(arr,0,arr.length-1);
        System.out.println("Array after sorting");
        display(arr);
    }
    static void display(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static void quicksort(int[] arr,int st,int end){
        if(st>=end) return;

        int pivot=partition(arr,st,end);
        quicksort(arr, st, pivot-1);
        quicksort(arr, pivot+1, end);
    }
    static int partition(int[] arr, int st,int end){
        int pivot= arr[st];
        int count_element_less_than_pivot=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<pivot) count_element_less_than_pivot++;
        }

        int pivot_index=st + count_element_less_than_pivot;
        swap(arr, st, pivot_index);
        int i=st,j=end;
        while(i<pivot_index && j>pivot_index){
            while(arr[i]<pivot) i++;
            while(arr[j]>pivot) j--;

            if(i<pivot_index && j>pivot_index){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivot_index;
    }
    static void swap(int[] arr,int x,int y){

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}

