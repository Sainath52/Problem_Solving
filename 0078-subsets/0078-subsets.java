class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        backtrack(nums,n,0,new ArrayList<>());
        return res;
    }
    public void backtrack(int[]nums,int n , int index, List<Integer> list)
    {
        res.add(new ArrayList<>(list));
        for(int i=index;i<n;i++)
        {
            list.add(nums[i]);
            backtrack(nums,n,i+1,list);
            list.remove(list.size()-1);
        }
    }
}