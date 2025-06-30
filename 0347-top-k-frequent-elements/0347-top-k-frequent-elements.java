class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> m=new HashMap<>();
      for(int n:nums){
        if(m.containsKey(n)){
            m.put(n,m.put(n,0)+1);
        }
        else{
            m.put(n,1);
        }
      }
      List<Integer> l=new ArrayList<>(m.keySet());
      l.sort((a,b)->m.get(b)-m.get(a));
      int[] res=new int[k];
      for(int i=0;i<k;i++){
        res[i]=l.get(i);
      }
 return res;

    }
}