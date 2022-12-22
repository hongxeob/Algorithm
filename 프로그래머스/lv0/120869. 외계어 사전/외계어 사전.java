class Solution {
    public int solution(String[] spell, String[] dic) { // ["z", "d", "x"]	["def", "dww", "dzx", "loveaw"]
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < dic.length; i++) {
            if (dic[i].length() == spell.length) {
                for (int j = 0; j < dic[i].length(); j++) {
                    if (dic[i].contains(spell[j])) {
                        cnt++; // 모두 포함되면 spell의 사이즈만큼 나올것이다
                    } else {
                        cnt = 0;
                        break;
                    }
                }
                if (cnt == spell.length) { // dic의 i배열의 글자수와 spell의 모든 알파벳이 다 일치하면
                    answer = 1;
                    break;
                } else {
                    continue;
                }
            } else {
                continue;
            } 
        }
        if (answer != 1) {
            answer = 2;
        }
        return answer;
    }
}