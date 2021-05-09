class Solution {
    public int firstMissingPositive(int[] nums) {
        
        ArrayList<Integer> a =new ArrayList<Integer>();
       for (int i=0;i<nums.length;i++){
           
           a.add(nums[i]);
       }
        
        int c = 0;
        for (int i=1;i<=Integer.MAX_VALUE;i++){
            
            if (a.contains(i)){
                
                continue;
            }
            else{
                
                c=i;
               break;
            }
            
            
        }
        
        return c;
    }
}