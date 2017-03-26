public class Solution {
    public int[] constructRectangle(int area) {
        int[] a = new int[2];
        int b = (int)(Math.sqrt(area));
        while(area%b!=0){
            b--;
        }
        a[1]=b;
        a[0]=area/b;
        return a;
    }
}