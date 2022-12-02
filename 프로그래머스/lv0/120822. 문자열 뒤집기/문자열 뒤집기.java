class Solution {
    public String solution(String my_string) {
        StringBuffer str = new StringBuffer(my_string);
        String answer = String.valueOf(str.reverse());// 문자형으로 바꿔준다
        return answer;
    }
}