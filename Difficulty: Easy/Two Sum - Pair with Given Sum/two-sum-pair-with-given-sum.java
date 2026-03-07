class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int val : arr) {
            if(map.containsKey(target - val)) {
                return true;
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return false;
    }
}