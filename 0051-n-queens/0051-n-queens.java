class Solution {
    List<List<String>> res =new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][]board = new char[n][n];
        for(char[]ch : board)
        {
            Arrays.fill(ch,'.');
        }
        boolean[] rows = new boolean[n];
        boolean[]leftd = new boolean[2*n-1];
        boolean[]rightd = new boolean[2*n-1];
        solve(0,board,rows,leftd,rightd,n);
        return res;
    }
    public void solve(int col ,char[][]board, boolean[]rows,boolean[]leftd,boolean[]rightd,int n)
    {
        if(col == n)
        {
            List<String> temp = new ArrayList<>();
            for(char[]c : board)
            {
                StringBuilder sb = new StringBuilder();
                for(char ch : c)
                {
                    sb.append(ch);
                }
                temp.add(sb.toString());
            }
            res.add(new ArrayList<>(temp));
        }
        for(int row = 0;row<n;row++)
        {
            int d1 = row+col;
            int d2 = n-1+row-col;
            if(rows[row] || leftd[d1] || rightd[d2])
            {
                continue;
            }
            rows[row] = true;
            leftd[d1] =true;
            rightd[d2] = true;
            board[row][col] = 'Q';
            solve(col+1,board,rows,leftd,rightd,n);
            rows[row] = false;
            leftd[d1] =false;
            rightd[d2] = false;
            board[row][col] = '.';
        }
    }
}