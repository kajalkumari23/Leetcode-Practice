class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder b = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                b.append(s.charAt(i));
            }
        }
        int n = b.length()-1;
        for(int i=0; i<b.length()/2; i++){
            if(b.charAt(i)!=b.charAt(n-i)){
                return false;
            }
        }
        return true;
    }
}