// class Solution {
//     public int sumSubarrayMins(int[] arr) {
//         int mod = 1000000007;
//         int len = arr.length;
        
//         int[] leftMin = new int[len];
//         Arrays.fill(leftLen,-1);
//         int[] rightMin[] = new int[len];
//         Arrays.fill(rightLen,len);
        
//         Stack<Integer>s = new Stack<>();
//         //monotonic stack
//         for(int i=0; i<len; i++){
//             while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//                 int index = s.pop();
//                 rightMin[index]=i;
//             }
//             s.push(i);
//         }
//         s.clear();
//         //
//         for(int i=len-1; i>=0; i--){
//             while(!s.isEmpty() && arr[s.peek()] > arr[i]){
//                 int index = s.pop();
//                 leftMin[index]=i;
//             }
//             s.push(i);
//         }
//         s.clear();
        
//         long res = 0;
//         for(int i = 0; i<len; i++){
//             int leftLen = i-leftMin[i];
//             int rightLen = rightMin[i]-i;
//             res = (res+((long)arr[i]*leftLen*rightLen)%mod)%mod;
//         }
//         return (int)res;
//     }
// }

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long res=0,mod = (int)1e9 + 7;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<int[]> st = new Stack<>();
        for(int i=0;i<n;i++) {
            int count=1;
            while(!st.isEmpty() &&  st.peek()[0] > arr[i])
                count+=st.pop()[1];
            st.push(new int[] { arr[i], count});
            left[i] = count;
        }
        st = new Stack<>();
        for(int i=n-1;i>=0;i--) {
            int count=1;
            while(!st.isEmpty() && st.peek()[0] >= arr[i])
                count+=st.pop()[1];
            st.push(new int[] { arr[i], count});
            right[i] = count;
        }
        for(int i=0;i<n;i++) {
            res = (res + (long)arr[i]*left[i]*right[i])%mod;
        }
        return (int)res;
    }
}