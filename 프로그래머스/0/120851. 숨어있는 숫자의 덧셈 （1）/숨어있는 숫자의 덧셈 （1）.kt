class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        for(i in 0 until my_string.length){
            if(my_string[i] in '1'..'9'){
                answer += my_string[i].toString().toInt()
            }
        }
        
        return answer
    }
}