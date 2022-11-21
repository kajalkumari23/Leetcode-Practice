class Solution {
    public String firstPalindrome(String[] words) {
      for(String s : words){
          if(isIt(s)){
              return s;
          }
      }
        return "";
    }
    public boolean isIt(String word){
        for(int i=0; i<word.length()/2; i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                return false;
            }    
        }
        return true;
    }
}


