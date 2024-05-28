class Solution {
     fun solution(numbers: IntArray): Int {
        var answer = 0
        for (i in 1..9) {
            if (!numbers.contains(i)) {
                answer += i
            }
        }
        return answer
    }
}
