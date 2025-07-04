class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=-1;
        for(int key:map.keySet()){
            if(map.get(key)==key){
                res=key;
            }
        }
        return res;
    }
}