public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int count = 0;
         int max = 0;
         for(int i=0;i<nums.length;i++){
             if(nums[i]==1){
                 for(int j=i;j<nums.length;j++){
                     if(nums[j]==1)count++;
                     else break;
                 }
                 if(count>max)max=count;
                 
             }
             count = 0;
         }
         return max;
    }
}