public class lexicographical_sort {
   public static void main(String[] args) {
        String[] arr={"kiwi","apple","papaya","mango"};
        lexicalsort(arr);
        for(String val: arr){
            System.out.print(val+" ");
        }
   }
   static void lexicalsort(String[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getmaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
   }
   static int getmaxIndex(String[] arr,int start,int last){
        int max=start;
        for(int i=start+1;i<=last;i++){
            if(arr[i].compareTo(arr[max])>0){
                max=i;
            }
        }

        return max;
   }
   static void swap(String[] arr,int first,int second){
       String temp=arr[first];
       arr[first]=arr[second];
       arr[second]=temp;
   }
}
