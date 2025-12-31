class Solution {
    public String[] findRestaurant(String[] list1,String[] list2){

        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }

        int min=Integer.MAX_VALUE;
        ArrayList<String> res=new ArrayList<>();

        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                int sum=map.get(list2[j])+j;

                if(sum<min){
                    res.clear();
                    res.add(list2[j]);
                    min=sum;
                }
                else if(sum==min){
                    res.add(list2[j]);
                }
            }
        }

        String[] ans=new String[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}
