class Solution {
    public void moveZeroes(int[] nums) {
        int swap=0;
        for(int i=0;i<nums.length-1;i++)
        {
            swap=0;
            for(int j=0;j<nums.length-1-i;j++)
            {
                if(nums[j]==0)
                {
                    int temp=nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;
                }
                swap++;
            }
            if(swap==0)
            break;
        }
    }
}