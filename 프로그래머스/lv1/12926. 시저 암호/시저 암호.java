class Solution {
public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            //c를 n만큼 민 문자를 sb에 이어 붙이기
            sb.append(push(c, n));
        }
        return sb.toString();
    }

    private char push(char c, int n) {
        if (!Character.isAlphabetic(c)) return c;

        int offset = Character.isUpperCase(c) ? 'A' : 'a';

        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);
        return (char) (offset + position);
    }
}