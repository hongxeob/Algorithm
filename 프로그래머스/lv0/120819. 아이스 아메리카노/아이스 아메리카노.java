class Solution {
    public int[] solution(int money) {
        int howCup = money / 5500;
        int change = money - (howCup * 5500);
        int[] answer = {howCup,change};
        return answer;
    }
}