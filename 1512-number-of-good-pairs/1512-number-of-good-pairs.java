class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] temp = new int[101];
        int res = 0;
        for(int i=0; i<nums.length; i++){
            res+= temp[nums[i]];
            temp[nums[i]]++;
        }
        return res;
    }
}