class Solution {
    public boolean exists(char[][] board,int i,int j,char [] wordarr,int idx)
    {
        if (
        i < 0 ||                       // row index out of upper bound
        i >= board.length ||          // row index out of lower bound
        j < 0 ||                       // column index out of upper bound
        j >= board[0].length ||       // column index out of lower bound
        board[i][j] == '*' ||         // cell already visited (commonly marked as '*')
        board[i][j] != wordarr[idx]      // current cell doesn't match the target character
        )
        return false;

        if(idx==wordarr.length-1)
        return true;
        char ch=board[i][j];
        board[i][j]='*';
        boolean ans=exists(board,i+1,j,wordarr,idx+1)||
                    exists(board,i-1,j,wordarr,idx+1)||
                    exists(board,i,j+1,wordarr,idx+1)||
                    exists(board,i,j-1,wordarr,idx+1);
        board[i][j]=ch;
        return ans;

    }
    public boolean exist(char[][] board, String word) {
        char [] wordarr=word.toCharArray();

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==wordarr[0]&&exists(board,i,j,wordarr,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
}