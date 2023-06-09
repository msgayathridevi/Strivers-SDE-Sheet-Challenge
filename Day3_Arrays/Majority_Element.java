class Solution {
    public int majorityElement(int[] v) {
        int n=v.length;
        HashMap<Integer,Integer> mpp= new HashMap<>();
        for(int i=0;i<n;i++){
            int value = mpp.getOrDefault(v[i],0);
            mpp.put(v[i],value+1);
        }
        // search majority ele
        for(Map.Entry<Integer,Integer>it : mpp.entrySet()){
            if(it.getValue()>(n/2))
                return it.getKey();
        }
        return -1;
    }
}