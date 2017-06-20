public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new LinkedList<>();
        int sum=2000;;
        for(int i=0; i<list1.length; i++) map.put(list1[i], i);
        for(int i=0; i<list2.length; i++) {
            Integer j = map.get(list2[i]);
            if(j!=null&&i+j<=sum){
                if(i+j<sum){
                    res = new LinkedList<>();sum=i+j;
                }
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}