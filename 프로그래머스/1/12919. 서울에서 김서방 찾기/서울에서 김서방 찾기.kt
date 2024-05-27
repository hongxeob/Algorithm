class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        seoul.forEachIndexed { i, it ->
            if (it == "Kim") {
                answer = "김서방은 ${i}에 있다"
            }
        }
        return answer
    }
}
