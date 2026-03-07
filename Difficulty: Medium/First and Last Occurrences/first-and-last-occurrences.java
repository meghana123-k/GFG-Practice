class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first = -1, last = -1;
        int low = 0, high = arr.length-1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if(x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0; high = arr.length-1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if(x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new ArrayList<>(Arrays.asList(first, last));
    }
}
