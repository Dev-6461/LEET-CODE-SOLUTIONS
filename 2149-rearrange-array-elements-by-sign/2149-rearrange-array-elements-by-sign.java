class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] ans = new int[nums.length];
        int plus = 0;
        int minus = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans[plus] = nums[i];
                plus += 2;
            }
            if(nums[i] < 0){
                ans[minus] = nums[i];
                minus += 2;
            }
        }
        return ans;
    }
}