class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int ans1=nums[0],ans2=-1,n=nums.length;
        int c1=1,c2=0;
        for(int i=1;i<n;i++){
            if(nums[i]==ans1){
                c1++;
            }
            else if(nums[i]==ans2){
                c2++;
            }
            else if(c2==0){
                ans2=nums[i];
                c2=1;
            }
            else if(c1==0){
                ans1=nums[i];
                c1=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ans1){
                c1++;
            }
            else if(nums[i]==ans2){
                c2++;
            }
            else{
                continue;
            }
        }
        if(c1>n/3) ans.add(ans1);
        if(c2>n/3) ans.add(ans2);
        return ans;


    }
}