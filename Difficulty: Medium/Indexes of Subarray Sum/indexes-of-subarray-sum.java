
class Solution {
    static ArrayList<Integer> subarraySum(int[] a, int k) {
        // code here
        int l = 0;
        int r = 0;
        int sum = a[0];
        ArrayList<Integer> res = new ArrayList<>(); 
        while(l < a.length && r < a.length) {
            // System.out.println("Hello");
            if(sum == k) {
                res.add(l+1);
                res.add(r+1);
                return res;
            } else if(r < a.length-1 && sum < k) {
                sum += a[r+1];
                r++;
            } else {
                sum -= a[l];
                l++;
            }
        }
        res.add(-1);
        return res;
    }
}
