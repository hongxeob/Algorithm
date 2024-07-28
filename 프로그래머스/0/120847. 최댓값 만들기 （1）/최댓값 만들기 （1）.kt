class Solution {
    fun solution(numbers: IntArray): Int {
        val list = numbers.sorted()
        val a = list.last()
        val b = list[list.size - 2]

        return a * b
    }
}