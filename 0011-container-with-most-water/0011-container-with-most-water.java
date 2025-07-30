class Solution {
    public int maxArea(int[] height) {
        int s=0,e=height.length-1;
        long ans=0,max=0;
        while(s<e){
            max=((long)Math.min(height[s],height[e]))*(e-s);
            if(max>ans){
                ans=max;
            }
            if(height[s]<height[e]){
                s++;
                continue;
            }
            else{
                e--;
            }
        }
        return (int)ans;
        
    }
    
}