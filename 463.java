public class Solution {
    public int islandPerimeter(int[][] grid) {
        int num=0;
        int neighbor=0;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j< grid[i].length;j++){
                if(grid[i][j]==1){
                    num++;
                    if(j<grid[i].length-1&&grid[i][j+1]==1){
                        neighbor++;
                    }
                    if(i<grid.length-1&&grid[i+1][j]==1){
                        neighbor++;
                    }
                }
            }
        }
        return num*4-neighbor*2;
    }
}