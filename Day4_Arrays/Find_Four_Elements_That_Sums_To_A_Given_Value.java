import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] nums, int target, int n) {
      Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int k=j+1;
                int l = nums.length-1;

                while(k<l){
                long sum= nums[i]+nums[j];
                sum+=nums[k];
                sum+=nums[l];
                    if(sum==target){
                      return "Yes";
                    }
                    else if(sum <target){
                        k++;
                    }
                    else  l--;
                }
            }
        }
        return "No";
  }
}
