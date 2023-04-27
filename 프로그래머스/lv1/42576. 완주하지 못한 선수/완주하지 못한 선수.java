import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        // 참가자 명단을 해시에 추가 (값을 숫자 1로 표기)
        for(String player : participant){
            map.put(player, map.getOrDefault(player,0) + 1);
        }
        //완주자 명단을 참가자 명단에 넣는데,
        //완주자에 명단에 있으면 -1을 해주어 0으로 만들어 준다.
        for(String player : completion){
            map.put(player, map.getOrDefault(player, 0) - 1);
        }
        //key로 값을 찾는데 값이 0이면 완주한 사람, 그게 아니라면 완주자 명단에 없는 사람 
        for(String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}