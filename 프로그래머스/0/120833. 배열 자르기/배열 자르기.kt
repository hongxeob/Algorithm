class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray = numbers.toList().subList(num1, num2+1).toIntArray()
}