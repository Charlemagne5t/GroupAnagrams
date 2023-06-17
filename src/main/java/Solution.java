import java.util.*;


public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String elem = strs[i];
            char[] chars = elem.toCharArray();
            Arrays.sort(chars);
            String key = Arrays.toString(chars);
            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(elem);
                map.put(key, list);
            } else {
                map.get(key).add(elem);
            }
        }
        List<List<String>> answer = new ArrayList<>();
        if (map.isEmpty()) {
            answer.add(new ArrayList<>());
            return answer;
        }
        for (Map.Entry<String, List<String>> x : map.entrySet()) {
            answer.add(x.getValue());
        }
        return answer;
    }

}
