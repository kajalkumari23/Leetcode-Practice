class Solution {
    public int longestConsecutive(int[] nums) {
        //insert all elements into set
        HashSet<Integer>hashSet = new HashSet<Integer>();
        for(int num:nums){
            hashSet.add(num);
        }
        int longestStreak = 0;  // it will compute maxm of all consecutive sequences
        for(int num:nums){
            if(!hashSet.contains(num-1)){
                int currentNum = num; 
                int currentStreak = 1;
                
                while(hashSet.contains(currentNum+1)){
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}