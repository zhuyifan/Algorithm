class Solution {
    public int[] findErrorNums(int[] nums) {
        int p =0;
        int[] res=new int[2];
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                res[0]=nums[i];
                break;
            }
        }
        int sum=(1+nums.length)*nums.length/2;
        int s=0;
        for(int num:nums){
            s+=num;
        }
        res[1]=sum-(s-res[0]);
        return res;
    }
}