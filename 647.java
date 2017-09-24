class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] max=new int[nums.length];
        max[0]=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                max[i]=max[i-1]+1;
            }
            else{
                max[i]=1;
            }
        }
        int m=1;
        for(int i=0;i<nums.length;i++){
            m=Math.max(m, max[i]);
        }
        return m;
    }
}