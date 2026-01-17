import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr={1,-2,7,6};
        bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps for n-1 times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //for each step, max items will come at the last respective item
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    arr[j]=arr[j]+arr[j-1];
                    arr[j-1]=arr[j]-arr[j-1];
                    arr[j]=arr[j]-arr[j-1];
                    swapped=true;

                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
