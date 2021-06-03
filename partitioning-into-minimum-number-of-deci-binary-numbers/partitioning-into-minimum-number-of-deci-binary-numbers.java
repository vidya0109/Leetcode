class Solution {
    public int minPartitions(String n) {
        int max = 0;
    for (int i=0;i<n.length();i++){
     
        int compare = Character.getNumericValue(n.charAt(i));
    if (max < compare) {
        max = compare;
    }
        }
        
        return max;
    }
        
        
     
    }
