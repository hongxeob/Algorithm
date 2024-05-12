class Solution {
    fun solution(numbers: IntArray): Double {
        var answer=0
        for(i in numbers){
            answer+=i
        }
        
        return answer.toDouble()/numbers.size
    }
}