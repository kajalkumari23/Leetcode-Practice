class Solution {
    public String firstPalindrome(String[] words) {
      for(String word : words){
          if(isPalindrome(word)){
              return word;
          }
      }
        return "";
    }
    public boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}


