class Solution {
    public boolean canJump(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++) {

            int max = i;
            int nextindex = i;

            for(int j = i + 1;
                j <= i + nums[i] && j < nums.length;
                j++) {

                int reach = j + nums[j];

                if(reach > max) {
                    max = reach;
                    nextindex = j;
                }

                if(reach >= nums.length - 1) {
                    return true;
                }
            }

            if(nextindex == i) {
                return false;
            }

            i = nextindex - 1;
        }

        return true;
    }
}