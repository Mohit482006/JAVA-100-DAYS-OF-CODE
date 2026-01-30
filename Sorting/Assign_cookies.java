class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count=0;
        int i=0;
        int j=0;
        int k=g.length;
        int l=s.length;

        while(i<k&&j<l){
            if(g[i]<=s[j]){
                i++;
                count++;
            }
            
            j++;
        }
        return count;

    }
}
