class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0){
            return 0;
        }
        int duraSum=0;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i]-timeSeries[i-1]<duration){
                duraSum+=timeSeries[i]-timeSeries[i-1];
            }
            else{
                duraSum+=duration;
            }
        }
        return duraSum+duration;
    }
}