public class Solution {
    public String reverseString(String s) {
        String a="";
        StringBuilder sb = new StringBuilder(a);//构造一个StringBuilder对象
        
        for (int i=s.length()-1;i>=0;i--){
            sb.insert(s.length()-1-i, s.charAt(i));
        }
        return sb.toString();
    }
}