

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Create buckets
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());

        for (int i = 0; i < keys.size(); i++) {

            int num = keys.get(i);
            int freq = map.get(num);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        // Traverse bucket from high frequency to low frequency
        for (int i = nums.length; i >= 0; i--) {

            if (bucket[i] != null) {

                for (int j = 0; j < bucket[i].size(); j++) {

                    result[index] = bucket[i].get(j);
                    index++;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}