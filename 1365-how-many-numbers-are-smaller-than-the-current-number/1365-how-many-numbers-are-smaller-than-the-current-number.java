class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n]; // ans array
        for(int i=0; i<n; i++){
            int count =0;
            for(int j=0; j<n; j++){
                if(nums[i]>nums[j] && i!=j){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
//brute force
//tc = O(n^2)
//sc = O(n)