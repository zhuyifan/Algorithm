public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] b=new int[findNums.length];
        int count =0;
        int x=0;
        for(int i=0;i< findNums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(findNums[i]==nums[j]){
                    for(int k=j;k<nums.length;k++){
                    if(nums[j]<nums[k]){
                    b[count]=nums[k];
                    count++;
                    x=1;
                    break;
                    }
                    }
                }
            }
            if(x==0){
            b[count]=-1;
            count++;
            }
            x=0;
        }
        return b;
    }
}