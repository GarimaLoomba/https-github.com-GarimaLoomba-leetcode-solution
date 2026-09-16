class Solution {

    public void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp ;
    }

    public void heapify(int[] nums ,int size , int index){
        int i = index ;

        while(i<size){
            int largest = i ;
            int left = 2*i+1;
            int right = 2*i+2;

            if(left<size && nums[left]>nums[largest]){
                largest = left ;
            }

            if(right<size && nums[right]>nums[largest]){
                largest = right;
            }

            if(largest==i){
                break ;
            }

            swap(nums,i,largest);
            i = largest;


        }
    }

    public void HeapSort(int[] nums){
        int n = nums.length ;

        for(int i = (n/2)-1 ;i>=0 ;i--){
            heapify(nums,n ,i);
        }

        int size = n ;

        while(size>1){
            swap(nums,0 , size-1);
            size--;
            heapify(nums , size , 0 );
        }
    }
    public int findKthLargest(int[] nums, int k) {
       HeapSort(nums);

        int n = nums.length ;
       return nums[n-k];

    }
}