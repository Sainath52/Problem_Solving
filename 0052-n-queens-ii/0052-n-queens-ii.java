class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        boolean[]rows = new boolean[n];
        boolean[]leftd = new boolean[2*n-1];
        boolean[]rightd = new boolean[2*n-1];
        solve(0,rows,leftd,rightd,n);
        return count;
    }
    public void solve(int col , boolean[]rows,boolean[]leftd,boolean[]rightd,int n)
    {
        if(col == n)
        { 
            count++;
            return;
        }
        for(int row= 0;row<n;row++)
        {
            int d1 = row+col;
            int d2 = n-1+row-col;
            if(rows[row] || leftd[d1] || rightd[d2])
            {
                continue;
            }
            rows[row] = true;
            leftd[d1] = true;
            rightd[d2] = true;
            solve(col+1,rows,leftd,rightd,n);
            rows[row] = false;
            leftd[d1] = false;
            rightd[d2] = false;
        }
    }
}