public class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        int a = n;
        if(a==1){
            return true;
        }
        while(a!=0&&a%2==0){
             
            a=a/2;
           if(a==1){
                return true;
            }
        }
        return false;
    }
}