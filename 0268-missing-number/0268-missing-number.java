class Solution {
    public int missingNumber(int[] nums) {
        int ARRsum=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            ARRsum+=nums[i];
        }
        sum=(nums.length*(nums.length+1))/2;
        return sum-ARRsum;
    }
}