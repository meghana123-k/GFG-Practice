class Solution {
    boolean[][] vis;
    int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    public void dfs(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length ||j >= grid[0].length) return;
        if(vis[i][j] || grid[i][j] != 'L') {
            return ;
        }
        if(grid[i][j] == 'L' && !vis[i][j]) {
            vis[i][j] = true;
        }
        for(int d = 0; d < 8; d++) {
            dfs(grid, i + dx[d], j + dy[d]);
        }
    }
    public int countIslands(char[][] grid) {
        // Code here
        int ans = 0;
        vis = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 'L' && !vis[i][j]) {
                    ans++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }
}