class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for(int num : nums) numset.add(num);

        int longest = 0;

        for (int num : nums) {
            if (!numset.contains(num - 1)) {
                int l = 1;
                while (numset.contains(num + l)) {
                    l++;
                }

                longest = Math.max(longest, l);
            }
        }

        return longest;
    }
}
