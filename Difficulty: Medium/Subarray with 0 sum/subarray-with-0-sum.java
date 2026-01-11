class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        set.add(0);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) return true;
            sum += arr[i];
            if(set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}