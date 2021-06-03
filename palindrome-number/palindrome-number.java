class Solution {
    public boolean isPalindrome(int x) {
        
        String s = String.valueOf(x);
        
        StringBuilder s1 = new StringBuilder(s);
        
        s1.reverse();
        
   
        
        if (s.equals(s1.toString())){
            
            return true;
        }
        else{
            
           return false;
        }
        
    }
}