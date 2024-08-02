Example 1:

Input: nums = [0,1,0,1,1,0,0]
Output: 1
Explanation: Here are a few of the ways to group all the 1's together:
[0,0,1,1,1,0,0] using 1 swap.
[0,1,1,1,0,0,0] using 1 swap.
[1,1,0,0,0,0,1] using 2 swaps (using the circular property of the array).
There is no way to group all 1's together with 0 swaps.
Thus, the minimum number of swaps required is 1.

  class Solution {
    public int minSwaps(int[] nums) {
        
        int n = nums.length;
        int ones = 0;
        for(int num : nums)
        {
            if(num==1)
                ones++;
        }

        int maxwindow =0;
        int window = 0;
       int l = 0;
        for(int r = 0;r<2*n;r++)
        {
            if(nums[r%n]==1)
                window++;
            
            if(r-l+1 > ones)
            {
                if(nums[l%n]==1)
                    window--;
                l++;
            }

            maxwindow = Math.max(maxwindow,window);
        }

        return ones - maxwindow;
    }
}
