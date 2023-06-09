class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int min=(nums.length)/3+1;
        for(int i=0;i<nums.length;i++){
            // mpp[nums[i]]++;
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            if(mpp.get(nums[i])==min){
                ls.add(nums[i]);
            }
        }
        return ls;
    }
}