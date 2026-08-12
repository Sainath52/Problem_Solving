class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        backtrack(nums,0,n,new ArrayList<>());
        return res;
    }
    public void backtrack(int[]nums , int index , int n , List<Integer> list)
    {
        res.add(new ArrayList<>(list));
        for(int i=index;i<n;i++)
        {
            if(index<i && nums[i] == nums[i-1])
            {
                continue;
            }
            
            list.add(nums[i]);
            backtrack(nums,i+1,n,list);
            list.remove(list.size()-1);
        }
    }
}