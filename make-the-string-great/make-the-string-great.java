class Solution {
    public String makeGood(String s) {
        
        Stack <Character> stack = new Stack<Character>();
        String ans = "";
        for (int i=0;i<s.length();i++){
            
            if((!stack.isEmpty()) && Math.abs(stack.peek()-s.charAt(i))==32 )
                stack.pop();
            else
                stack.push(s.charAt(i));
            
            
        }
        
        for (int i=0;i<stack.size();i++){
            
            ans = ans + stack.get(i);
            
        }
        
     
        
       return ans; 
        
        
    }
}