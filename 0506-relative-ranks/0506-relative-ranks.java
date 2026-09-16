class Solution {
    public String[] findRelativeRanks(int[] score) {
        TreeMap<Integer,String> map = new TreeMap<>(Collections.reverseOrder()) ;
        for(int i =0 ;i < score.length ; i++){
            map.put(score[i],"0");
        }
    int rank = 1 ;
        for(int key : map.keySet()){
            map.put(key , String.valueOf(rank));
            rank++;
        }


        String[] arr = new String[score.length] ;

        for(int i = 0 ; i < score.length ; i++){
            if(map.get(score[i]).equals("1")){
                arr[i] = "Gold Medal";
            }
            else if(map.get(score[i]).equals("2")){
                arr[i] = "Silver Medal";
            }
            else if(map.get(score[i]).equals("3")){
                arr[i] = "Bronze Medal";
            }
            else{
                arr[i] = map.get(score[i]);
            }
        }

        

        
    return arr;


    }
}