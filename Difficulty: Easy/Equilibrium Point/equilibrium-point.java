class Solution {
    public static int findEquilibrium(int arr[]) {
        int pf = 0, tot = 0;
        for(int ele : arr) {
            tot += ele;
        }
        for(int i = 0; i < arr.length; i++) {
            int sf = tot - arr[i] - pf;
            if(sf == pf) return i;
            pf += arr[i];
        }
        return -1;
    }
}
