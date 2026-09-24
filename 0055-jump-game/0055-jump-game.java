class Solution {
    public boolean canJump(int[] nums) {

        int tempindex = 0;
    if(nums.length==1){
        return true ;
    }
        for (int i = 0; i < nums.length - 1;) {

            int max = 0;
            int oldindex = i;

            for (int j = i + 1;
                 j <= i + nums[i] && j < nums.length;
                 j++) {

                if (j == nums.length - 1) {
                    return true;
                }

                if (j + nums[j] > max) {
                    max = nums[j] + j;
                    tempindex = j;
                }
            }

            if (tempindex == oldindex) {
                return false;
            }

            i = tempindex;
        }

        return false;
    }
}