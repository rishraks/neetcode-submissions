class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int el : nums) {
            if (!set.add(el)) {
                return true;
            }
            set.add(el);
        }
        return false;
    }
}