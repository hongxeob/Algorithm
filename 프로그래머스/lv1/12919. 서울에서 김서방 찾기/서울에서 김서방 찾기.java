class Solution {
    public String solution(String[] seoul) {
        String result = null;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                result = String.valueOf(i);
                break;
            }
        }
        return  "김서방은 " + result + "에 있다";
    }
}