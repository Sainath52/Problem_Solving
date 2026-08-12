class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        backtrack(nums,0,n,new ArrayList<>());
        return res;
    }
    public void backtrack(int[]nums , int index, int n , List<Integer> list)
    {
        if(n == list.size())
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(list.contains(nums[i]))
            {
                continue;
            }
            list.add(nums[i]);
            backtrack(nums,i+1,n,list);
            list.remove(list.size()-1);
        }
    }
}