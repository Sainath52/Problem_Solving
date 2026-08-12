class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        boolean[]used = new boolean[n];
        backtrack(nums,0,n,used,new ArrayList<>());
        return res;
    }
    public void backtrack(int[]nums , int index , int n , boolean[]used,List<Integer> list)
    {
        if(n==list.size())
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i =0;i<n;i++)
        {
            if(used[i])continue;
            if(i>0 && nums[i-1] == nums[i] && !used[i-1])continue;
            used[i] = true;
            list.add(nums[i]);
            backtrack(nums,i+1,n,used,list);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }
}