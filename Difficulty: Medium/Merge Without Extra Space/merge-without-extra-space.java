class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        // int p1 = n-1;int p2 = 0;
        // while(p1 >= 0 && p2 < m) {
        //     if(a[p1] > b[p2]) {
        //         int temp = b[p2];
        //         b[p2] = a[p1];
        //         a[p1] = temp;
        //         p1--;
        //         p2++;
        //     } else {
        //         break;
        //     }
        // }
        // Arrays.sort(a);
        // Arrays.sort(b);
        int p1 = 0; int p2 = 0;
        int k = 0;
        int res[] = new int[n+m];
        while(p1 < n && p2 < m) {
            if(a[p1] < b[p2]) {
                res[k] = a[p1];
                p1++;
                k++;
            } else {
                res[k] = b[p2];
                p2++;
                k++;
            }
        }
        while(p1 < n) {
            res[k++] = a[p1++];
        }
        while(p2 < m) {
            res[k++] = b[p2++];
        }
        for(int i = 0; i < n; i++) {
            a[i] = res[i];
        }
        for(int j = 0; j < m; j++) {
            b[j] = res[j+n];
        }
    }
}
