class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("left")) {
            int firstValue = numbers[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = firstValue;
        } else {
            int lastValue = numbers[numbers.length - 1]; //[1,2,3]->[3.1.2]
            for (int i = numbers.length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = lastValue;
        }
        return numbers;
    }
}