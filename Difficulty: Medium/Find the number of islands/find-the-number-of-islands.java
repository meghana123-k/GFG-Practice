class Solution {
    boolean[][] vis;
    int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    int[] dy = {0, 1,1,1,0, -1, -1, -1};
    public void dfs(char[][] grid, int i, int j, int n, int m) {
        if(i < 0 || i >= n || j < 0 || j >= m) return;
        if(grid[i][j] != 'L' || vis[i][j]) return;
        if(grid[i][j] == 'L' && !vis[i][j]) {
            vis[i][j] = true;
        }
        for(int k = 0; k < 8; k++) {
            dfs(grid, i+dx[k], j+dy[k], n, m);
        }
        // dfs(grid, i-1 , j, n, m);
        // dfs(grid, i-1, j+1, n, m);
        // dfs(grid, i, j+1, n, m);
        // dfs(grid, i+1, j+1, n, m);
        // dfs(grid, i+1, j, n, m);
        // dfs(grid, i+1, j-1, n, m);
        // dfs(grid, i, j-1, n, m);
        // dfs(grid, i-1, j-1, n, m);
        
    }
    public int countIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
         vis = new boolean[n][m];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 'L' && !vis[i][j]) {
                    cnt++;
                    // vis[i][j] = true;
                    dfs(grid, i, j, n, m);
                }
            }
        }
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++) {
        //         System.out.print(vis[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        return cnt;
    }
}