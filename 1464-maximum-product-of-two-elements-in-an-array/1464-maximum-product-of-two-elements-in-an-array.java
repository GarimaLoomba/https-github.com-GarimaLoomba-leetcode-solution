class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


        for(int i =0  ;i < nums.length ; i++){
            pq.offer(nums[i]);
        } 


        int x = pq.poll() ;
        int y = pq.poll() ;

        return (x-1)*(y-1);
    }
}