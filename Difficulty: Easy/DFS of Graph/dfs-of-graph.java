class Solution {
    ArrayList<Integer> res;
    public void helper(ArrayList<ArrayList<Integer>> adj, int start, boolean[] vis) {
        
        vis[start] = true;
        res.add(start);
        
        for(int nei : adj.get(start)) {
            if(!vis[nei]) {
                vis[nei] = true;
                helper(adj, nei, vis);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        res = new ArrayList<>();
        boolean vis[] = new boolean[adj.size()+1];
        helper(adj, 0, vis);
        return res;
    }
}