//Time Complexity : O(logn)
// Space Complexity : O(1)
class Solution {
    public int search(int[] nums, int target) {

        if(nums == null || nums.length ==0){
            return -1;
        }
        int low =0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(nums[low] <= nums[mid]){ // left sorted
                if(nums[low] <= target && nums[mid] > target ){
                     high = mid -1;
                    }
                else{
                    low = mid + 1;
                }
            }
            else{
                // right sorted
                if(nums[high] >= target && nums[mid] < target){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                } 
            } 
        }
         return -1;
    }
   
}