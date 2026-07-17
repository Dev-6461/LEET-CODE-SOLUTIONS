class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0 ; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int writer = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[writer] = nums[i];
                writer++;
            }
        }
        while(writer < nums.length){
            nums[writer] = 0;
            writer++;
        }
        return nums;
    }
}