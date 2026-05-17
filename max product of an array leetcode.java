import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        Scanner scan=new Scanner(System.in);
        Arrays.sort(nums);
       // int []nums={3,4,5,2};
        
                int max=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    
        return max;
        }  
    
}
