class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for(int val : arr) {
            if(map.get(val) > arr.length/2) {
                return val;
            }
        }
        return -1;
    }
}