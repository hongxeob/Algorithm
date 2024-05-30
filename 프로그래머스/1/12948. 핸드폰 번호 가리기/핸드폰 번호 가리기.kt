class Solution {
     fun solution(phone_number: String): String {
        var answer = ""
        val length = phone_number.length - 4
        for (i in 0 until length) {
            answer += "*"
        }

        answer += phone_number.substring(length, length + 4)

        return answer
    }
}