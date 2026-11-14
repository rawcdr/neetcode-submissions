class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sword = new String(c);

            res.putIfAbsent(sword, new ArrayList<>());
            res.get(sword).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
