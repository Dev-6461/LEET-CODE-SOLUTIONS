class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int num : nums){
            ans.put(num, ans.getOrDefault(num, 0) + 1);
        }
        int result[] = new int[2];
        int index = 0;
        for(int num : nums){
            if(ans.get(num) == 1){
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}