public class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) kinds.add(candy);
        return Math.min(kinds.size(), candies.length/2);
        // Arrays.sort(candies);
        // int length=candies.length;
        // int num=1;
        // for(int i=1;i<length;i++){
        //     if(candies[i]!=candies[i-1]){
        //         num++;
        //     }
        // }
        // if(length/2<num){
        //     return length/2;    
        // }
        // else return num;
    }
}