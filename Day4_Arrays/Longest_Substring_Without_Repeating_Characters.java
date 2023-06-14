class Solution {
    public int lengthOfLongestSubstring(String str) {
        if(str.length()==0) return 0;
        int longest = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        int left=0,right=0;
        while(right<str.length()){
            if(set.contains(str.charAt(right))){
                while( set.contains(str.charAt(right))){
                    set.remove(str.charAt(left++));
                    // left++;
                }
            }
            set.add(str.charAt(right));
            longest=Math.max(longest,(right-left+1));
            right++;
        }
        return longest;
    }
}