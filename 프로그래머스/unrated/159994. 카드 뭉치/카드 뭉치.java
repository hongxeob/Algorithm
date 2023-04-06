class Solution {
     public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Index = 0;
        int card2Index = 0;
        for (int i = 0; i < goal.length; i++) {
            if (cards1[card1Index].equals(goal[i])) {
                card1Index = (card1Index < cards1.length - 1) ? card1Index + 1 : card1Index;
            } else if (cards2[card2Index].equals(goal[i])) {
                card2Index = (card2Index < cards2.length - 1) ? card2Index + 1 : card2Index;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}