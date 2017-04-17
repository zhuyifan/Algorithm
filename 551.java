public class Solution {
    public boolean checkRecord(String s) {
        int A = 0;
        int countL = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                A++;
                countL = 0;
            }
             else if(s.charAt(i)=='L'){
                countL++;
            }
            else{
                countL = 0;
            }
            if(A>1||countL>2){
                return false;
            }
        }
        return true;
    }
}

// public boolean checkRecord(String s) {
//     return !s.matches(".*LLL.*|.*A.*A.*");
// }