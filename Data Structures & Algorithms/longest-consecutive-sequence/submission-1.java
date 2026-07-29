class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int el : nums) {
            treeSet.add(el);
        }
        int count = 1, max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>(treeSet);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) + 1 == list.get(i + 1)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);
        return max;
    }
}
