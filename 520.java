public class Solution {
    public boolean detectCapitalUse(String word) {
        char[] a = word.toCharArray();
        if(a.length==1){
            return true;
        }
        if(Character.isUpperCase(a[0])){
            if(Character.isUpperCase(a[1])){
                for(int i=1;i<a.length;i++){
                    if(Character.isLowerCase(a[i])){
                        return false;
                    }
                }
            }
            if(Character.isLowerCase(a[1])){
                for(int i=1;i<a.length;i++){
                    if(Character.isUpperCase(a[i])){
                        return false;
                    }
                }
            }
            return true;
        }
        if(Character.isLowerCase(a[0])){
            for(int i=1;i<a.length;i++){
                    if(Character.isUpperCase(a[i])){
                        return false;
                    }
                }
                return true;
        }
        return false;
    }
}