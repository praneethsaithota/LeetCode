class Solution {
    int c=0;
    public int reversePairs(int[] nums) {
        int l=0;
        int h=nums.length-1;
        merge_sort(nums,l,h);
        return c;
    }
    public void merge_sort(int[] nums,int l,int h){
        if(l>=h) return;
        int m=(l+h)/2;
        merge_sort(nums,l,m);
        merge_sort(nums,m+1,h);
        merge(nums,l,m,h);
    }
    public void merge(int[] nums,int low,int mid,int high){
        int final_low=low;
        int final_high=high;
        int n=(mid-low) +1;
        int m=high-mid;
        int[] left=new int[n];
        int i=0;
        while(i<n ){
            left[i++]=nums[low++];
            
        }
        int[] right=new int[m];
        i=0;
        while(i<m ){
            right[i++]=nums[++mid];
            
        }
        int r=0;
        for(int l=0;l<n;l++){
            while(r<m && (long)left[l] > 2L*right[r]) r++;
            c+=r;
        }
        r=0;
        
        int[] sorted=new int[n+m];
        int l=0,s=0;
        while(l<n && r<m){
            if(left[l] <= right[r]){
                sorted[s++]=left[l++];
                
            }
            else{
                
                sorted[s++]=right[r++];
                
            }
        }
        while(l<n) {
            sorted[s++] = left[l++];
        }
        while(r<m) {
            sorted[s++] = right[r++];
        }
        for(int x=0;x<sorted.length;x++){
            nums[final_low + x] = sorted[x];
        }


    }
}

