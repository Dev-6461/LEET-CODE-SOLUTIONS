class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length]; // temporary array
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            boolean alreadyAdded = false;

            // check if already in temp (avoid duplicates)
            for (int x = 0; x < k; x++) {
                if (temp[x] == nums1[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (alreadyAdded) continue;

            // check in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    temp[k++] = nums1[i];
                    break;
                }
            }
        }

        // copy to result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}