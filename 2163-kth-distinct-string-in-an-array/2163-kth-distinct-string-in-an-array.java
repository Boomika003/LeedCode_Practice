class Solution {
    public String kthDistinct(String[] arr, int k) {
      Map<String, Integer> Map = new LinkedHashMap<>();
        for (String s : arr) {
            Map.put(s, Map.getOrDefault(s, 0) + 1);
        }
        int Count = 0;
        for (String s : Map.keySet()) {
            if (Map.get(s)==1) {
                Count++;
                if (Count==k) {
                    return s;
                }
            }
        }
        return "";
    }
}