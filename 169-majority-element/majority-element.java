

class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 0) return -1;
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i])) {
                hmap.put(nums[i], hmap.get(nums[i]) + 1); // Increment the count for existing key
            } else {
                hmap.put(nums[i], 1); // Add a new key with count 1
            }
        }

        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > nums.length / 2) return entry.getKey();
        }

        return -1;
    }
}
