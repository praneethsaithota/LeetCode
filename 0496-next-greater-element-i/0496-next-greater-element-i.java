class Solution{
    public int[] nextGreaterElement(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> map=new HashMap<>();
        Deque<Integer> st=new ArrayDeque<>();
        for(int x:nums2){
            while(!st.isEmpty() && st.peekLast()<x) map.put(st.removeLast(),x);
            st.addLast(x);
        }
        while(!st.isEmpty()) map.put(st.removeLast(),-1);
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++) ans[i]=map.getOrDefault(nums1[i],-1);
        return ans;
    }
}
