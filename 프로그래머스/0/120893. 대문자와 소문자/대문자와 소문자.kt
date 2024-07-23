class Solution {
    fun solution(my_string: String): String = my_string.toCharArray()
        .map { if (it.isUpperCase()) it.toLowerCase() else it.toUpperCase() }
        .joinToString("")
}