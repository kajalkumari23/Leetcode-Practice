class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hashset = new HashSet<>();
        
        for(int i=0; i<n; i++){
            hashset.add(nums[i]);
        }
        for(int i=0; i<n; i++){
            if(!hashset.contains(i)){
                return i;
            }
        }
        return n;
    }
}

