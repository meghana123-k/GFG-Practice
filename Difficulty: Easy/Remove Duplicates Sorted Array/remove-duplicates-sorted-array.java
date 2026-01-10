class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i < arr.length) {
            res.add(arr[i]);
            while(i < arr.length && arr[i] == arr[j]) {
                i++;
            }
            j = i;
        }
        return res;
    }
}
