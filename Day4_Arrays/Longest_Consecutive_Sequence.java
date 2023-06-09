import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        Set<Integer> hashset = new HashSet<>();
        for(int num:arr){
            hashset.add(num);
        }
        int longest=0;
        for(int num:arr){
            if(!hashset.contains(num-1)){
                int curr_num=num;
                int curr_long = 1;
                while(hashset.contains(curr_num+1)){
                    curr_num++;
                    curr_long++;
                }
                longest=Math.max(longest, curr_long);
            }
        }
        return longest;
    }
}