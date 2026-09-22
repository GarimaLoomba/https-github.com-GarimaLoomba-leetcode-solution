class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0 ;
        int ten = 0 ;

        for(int i =0 ;i <bills.length ;  i++){
            if(bills[i]==5){
                five++;
            }

            else if(bills[i]==10){
                ten++;
                if(five==0){
                    return false ;
                }
                five--;
            }

            else if(bills[i]==20){
                if(ten==0){
                    if(five<3){
                        return false;
                    }
                    else{
                        five = five-3;
                    }
                }
                else{
                     ten--;
                if(five==0){
                    return false ;
                }
                five--;
                }
               

            }
        }

        return true ;
    }
}