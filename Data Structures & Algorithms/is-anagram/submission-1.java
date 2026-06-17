class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] letterCount = new int[26];
       // Count characters from s
        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 'a']++;
        }
        // Subtract characters from t
        for (int i = 0; i < t.length(); i++) {
            letterCount[t.charAt(i) - 'a']--;
        }
             // Check all counts
        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] != 0) {
                return false;
            }
        }
        return true;
    }
}



