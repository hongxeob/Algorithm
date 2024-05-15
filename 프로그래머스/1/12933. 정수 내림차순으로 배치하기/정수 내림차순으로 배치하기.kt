class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        val num = n.toString()
        val arr = num.toCharArray().sortedArrayDescending()
        answer = String(arr).toLong()
        return answer
    }
}
