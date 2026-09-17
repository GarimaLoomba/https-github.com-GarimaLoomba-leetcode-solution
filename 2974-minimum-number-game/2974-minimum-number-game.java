class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;

        for(int i = 0 ;i < nums.length ; i++){
            pq.offer(nums[i]);
        }
    int[] arr= new int[nums.length];
       
      int index =0 ;
        while(!pq.isEmpty()){
            int x = pq.poll() ;
            int y = pq.poll() ;
        arr[index++] = y;
        arr[index++] = x ;

            
        }

        return arr;
    }
}