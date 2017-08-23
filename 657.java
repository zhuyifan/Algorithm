class Solution {
    public boolean judgeCircle(String moves) {
        int[] array = new int[2];
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R')array[0]++;
            if(moves.charAt(i)=='L')array[0]--;
            if(moves.charAt(i)=='U')array[1]++;
            if(moves.charAt(i)=='D')array[1]--;
    }
        if(array[0]==0&&array[1]==0)return true;
        return false;
}
}