/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low=1, high=n;
        return helper(low,high);
        
    }
    
    public int helper(int low, int high){
        if(low>high) return -1;
        int mid = low + (high-low)/2;
        
        int ans = guess(mid);
        
        if(ans==0){
            return mid;
        }else if(ans==-1){
            return helper(low,mid-1);
        }else{
            return helper(mid+1,high);
        }
    }
}