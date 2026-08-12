class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] c, int target) {
        Arrays.sort(c);
        backtrack(c,target,0,c.length,new ArrayList<>());
        return res;
    }
    public void backtrack(int[]arr,int target,int index , int n ,List<Integer>list)
    {
        if(target == 0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        if(target<0)
        {
            return;
        }
        for(int i=index;i<n;i++)
        {
            if(i>index && arr[i] == arr[i-1])
            {
                continue;
            }
            list.add(arr[i]);
            backtrack(arr,target-arr[i],i+1,n,list);
            list.remove(list.size()-1);
        }
    }
}