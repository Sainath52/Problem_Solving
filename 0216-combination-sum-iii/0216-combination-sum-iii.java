class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(k,n,new ArrayList<>(),1);
        return res;
    }
    public void backtrack(int k , int n ,List<Integer> list, int index)
    {
       if(list.size()==k && n==0)
       {
        res.add(new ArrayList<>(list));
        return;
       }
       if(list.size() == k || n<0)
       {
        return;
       }
       for(int i = index;i<=9;i++)
       {
        list.add(i);
        backtrack(k,n-i,list,i+1);
        list.remove(list.size()-1);
       }
    }
}