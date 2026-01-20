class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] left = new int[m];
        int[] right = new int[n];
        int[] arr=new int[m+n];

        

        for(int i=0;i<m;i++){
            left[i]=nums1[i];
        }

        for(int j=0;j<n;j++){
            right[j]=nums2[j];
        }

        int i=0;
        int j=0;
        int k=0;
        while(i<m&&j<n){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
        while(i<m){
            arr[k++]=left[i++];
        }
        while(j<n){
            arr[k++]=right[j++];
        }

        for(int x=0;x<m+n;x++){
            nums1[x]=arr[x];
        }
    }
}
