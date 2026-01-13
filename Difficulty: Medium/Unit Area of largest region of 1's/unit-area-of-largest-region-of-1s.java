class Solution {
    // Function to find unit area of the largest region of 1s.
    boolean[][] vis;
    int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    int[] dy = {0, 1,1,1,0, -1, -1, -1};
    public int dfs(int[][] grid, int i, int j, int n, int m) {
        if(i < 0 || i >= n || j < 0 || j >= m) return 0;
        if(grid[i][j] != 1 || vis[i][j]) return 0;
        if(grid[i][j] == 1 && !vis[i][j]) {
            vis[i][j] = true;
        }
        int node = 1;
        for(int k = 0; k < 8; k++) {
            node += dfs(grid, i+dx[k], j+dy[k], n, m);
        }
        return node;
        // dfs(grid, i-1 , j, n, m);
        // dfs(grid, i-1, j+1, n, m);
        // dfs(grid, i, j+1, n, m);
        // dfs(grid, i+1, j+1, n, m);
        // dfs(grid, i+1, j, n, m);
        // dfs(grid, i+1, j-1, n, m);
        // dfs(grid, i, j-1, n, m);
        // dfs(grid, i-1, j-1, n, m);
        
    }
    public int findMaxArea(int[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
         vis = new boolean[n][m];
        // int cnt = 0;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1 && !vis[i][j]) {
                    int count = dfs(grid, i, j, n, m);
                    ans = Math.max(ans, count);
                }
            }
        }
        return ans;
    }
}