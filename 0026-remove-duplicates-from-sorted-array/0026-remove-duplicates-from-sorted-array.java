// two pointer approach T.C = O(n), S.C O(n)
// hashset approach hasnet does not contain duplicates //brute force tc= O(nlogn) +O(n)
// n for traversing into array and logn for inserting into the set and O(n) for removing element out of the set
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int j = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i]!= nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1; // because index starts from 0
}
}