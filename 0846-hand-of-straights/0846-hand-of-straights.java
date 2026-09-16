class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length ;

        if(n%groupSize!=0){
            return false ;
        }

        TreeMap<Integer , Integer> map = new TreeMap<>() ;

        for(int i = 0 ;i< hand.length ; i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }

        while(!map.isEmpty()){
            int smallest = map.firstKey() ;
            int count = map.get(smallest);

            for(int i = smallest ; i< smallest+groupSize ;i++){
                if(map.getOrDefault(i,0)<count){
                    return false ;
                }

                int remaining = map.get(i) - count ;

                if(remaining==0){
                    map.remove(i);
                }
                else{
                      map.put(i,remaining);
                }

              
            }
        }
        return true ;
    }
}