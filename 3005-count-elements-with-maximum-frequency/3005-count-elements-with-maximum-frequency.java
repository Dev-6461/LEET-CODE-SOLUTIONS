class Solution {
    public int maxFrequencyElements(int[] nums) {
        // HashMap<Integer, Integer> ans = new HashMap<>();
        // for(int num : nums){
        //     ans.put(num, ans.getOrDefault(num, 0) +1);
        // }
        // int maxFreq = 0;
        // for(int f : ans.values()){
        //     maxFreq = Math.max(maxFreq , f);
        // }
        // int count = 0;
        // for(int f : ans.values()){
        //     if(f == maxFreq){
        //         count = count + f;
        //     }
        // }
        // return count;
        HashSet<Integer> ans = new HashSet<>();
        for(int num : nums){
            ans.add(num);
        }
        int maxFreq = 0;
        int answer = 0;
        for(int num : ans){
            int freq = 0;
            for(int n : nums){
                if(n == num){
                    freq++;
                }
            }
            if(freq > maxFreq){
                maxFreq = freq;
                answer = freq;
            }
            else if(freq == maxFreq){
                answer = answer + freq;
            }
        }
        return answer;
    }
}