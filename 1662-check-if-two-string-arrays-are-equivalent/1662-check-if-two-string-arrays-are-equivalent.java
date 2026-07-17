class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String result1 = "";
        String result2 = "";
        for(String s1: word1){
            result1 += s1;
        }
        for(String s2 : word2){
            result2 += s2;
        }
        return result1.equals(result2);
    }
}