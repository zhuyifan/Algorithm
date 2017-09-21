class Solution {
    public int[][] imageSmoother(int[][] M) {
        int l1 = M.length;
        int l2 = M[0].length;
        int[][] N = new int[l1][l2];
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                int sum=M[i][j];
                int count=1;
                if(i!=0){
                    sum+=M[i-1][j];
                    count++;
                }
                if(i!=l1-1){
                    sum+=M[i+1][j];
                    count++;
                }
                if(j!=0){
                    sum+=M[i][j-1];
                    count++;
                }
                if(j!=l2-1){
                    sum+=M[i][j+1];
                    count++;
                }
                if(i!=0&&j!=0){
                    sum+=M[i-1][j-1];
                    count++;
                }
                if(i!=0&&j!=l2-1){
                    sum+=M[i-1][j+1];
                    count++;
                }
                if(i!=l1-1&&j!=0){
                    sum+=M[i+1][j-1];
                    count++;
                }
                if(i!=l1-1&&j!=l2-1){
                    sum+=M[i+1][j+1];
                    count++;
                } 
                N[i][j]=sum/count;
            }
        }
        return N;
    }
}
