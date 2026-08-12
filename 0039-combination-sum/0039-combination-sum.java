class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] c, int target) {
        backtrack(c,new ArrayList<>(),0,target);
        return res;
    }
    public void backtrack(int[] arr , List<Integer> list , int index , int target)
    {
        if(target == 0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        if(target<0){
            return;
        }
        for(int i = index;i<arr.length;i++)
        {
            list.add(arr[i]);
            backtrack(arr,list,i,target-arr[i]);
            list.remove(list.size()-1);
        }
    }
}