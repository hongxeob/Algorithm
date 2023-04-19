class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (i == 0) {
                map.put(sc, tc);
            } else {
                if (map.containsKey(sc)) {
                    if (map.get(sc) != tc) {
                        return false;
                    }
                } else if (map.containsValue(tc)) {
                    return false;
                }
            }
            map.put(sc, tc);
        }
        return true;
    }
}
