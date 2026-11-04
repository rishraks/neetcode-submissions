class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int el : nums) {
            freqMap.put(el, freqMap.getOrDefault(el, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : freqMap.entrySet()) {
            int f = e.getValue();
            if (bucket[f] == null) {
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(e.getKey());
        }

        int[] res = new int[k];
        int idx = 0;
        for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[idx++] = num;
                    if (idx == k) {
                        break;
                    }
                }
            }
        }

        return res;
    }
}
