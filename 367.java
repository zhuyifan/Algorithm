public class Solution {
    public boolean isPerfectSquare(int num) {
      int count=1;
      while(num>0){
          num=num-count;
          count+=2;
      }
      return num==0;
    }

     public boolean isPerfectSquare1(int num) {
      int low = 1, high = num;
        while (low <= high) {
            long mid = (low + high)/2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }//binary search

    public boolean isPerfectSquare2(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x)/2;
        }
        return x * x == num;
    }//Newton Method
}