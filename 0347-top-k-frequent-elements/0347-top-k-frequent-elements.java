class Solution {

    class Pair{
        int element ;
        int frequency ;

        Pair(int element , int frequency ){
            this.element = element ;
            this.frequency = frequency ;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map =  new HashMap<>() ;

        for(int i =0 ;i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.frequency - a.frequency);
        for(int num : map.keySet()){
            pq.offer(new Pair(num,map.get(num)));
        }

        int[] arr = new int[k];

        for(int i =0 ;i < k ;i++){
            arr[i] = pq.poll().element ;
        }

        return arr ;

    }
}