class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int as[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            as[s.charAt(i) - 'a']++;
            as[t.charAt(i) - 'a']--;
        }

        for (int num : as) {
            if (num != 0) return false;
        }

        return true;
    }
}
