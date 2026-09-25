class Solution {
    public int jump(int[] nums) {
        int tempindex =0 ;
        int count = 0 ;
        for(int i =0 ;i < nums.length -1;){
            int max = 0 ;
            for(int j = i+1 ; j <= i+nums[i] && j < nums.length ; j++){
                if(j+nums[j]>max){
                    max = j+nums[j];
                    tempindex = j ;
                }

                if(j==nums.length-1){
                    return count+1 ;
                }
            }
            i = tempindex;
            count++;
             
        }
        return count ;
    }
}