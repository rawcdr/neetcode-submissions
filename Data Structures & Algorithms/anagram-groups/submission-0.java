class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String ns = new String(arr);

            res.putIfAbsent(ns, new ArrayList<>());
            res.get(ns).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
