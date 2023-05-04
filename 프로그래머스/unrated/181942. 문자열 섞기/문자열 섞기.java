class Solution {
 public String solution(String str1, String str2) {
        String answer = "";
        String[] split = str1.split("");
        String[] split1 = str2.split("");
        for (int i = 0; i < str1.length(); i++) {
            answer += split[i];
            answer += split1[i];
        }
        return answer;
    }
}