public class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
            }
        Arrays.sort(nums);
        int sum=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                sum++;
                if(sum>(nums.length/2)){
                    return nums[i];
                }
            }
            else{
                sum=1;
            }
        }
        return 0;
    }
}