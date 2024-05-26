class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        val max = Math.max(a, b)
        val min = Math.min(a, b)
        for (i in min..max) {
            answer += i
        }
        return answer
    }
}
