public class Solution {
    public int solve(int[] a, int k) {
        int xr=0,x=0,cnt =0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        for(int i=0;i<a.length;i++){
           
            xr=xr^a[i];
            x=xr^k; // prev of k eduthurum of any length
           
            if(mpp.containsKey(x)){
                cnt+=mpp.get(x);
            }
            mpp.put(xr,(mpp.getOrDefault(xr,0)+1));
        }
        return cnt;
    }
}
