import java.util.ArrayList;
import java.util.List;

class Solution {
   private static final char[] CHARS = "AEIOU".toCharArray();

   public int solution(String word) {
        return generate("").indexOf(word);
    }

    private List<String> generate(String word) {
        //종료 조건, 점화식 구현
        List<String> words = new ArrayList<>();
        words.add(word);

        if (word.length() == 5) return words;

        for (char c : CHARS) {
            words.addAll(generate(word + c));
        }
        return words;
    }
}