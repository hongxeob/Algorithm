class Solution {
    fun solution(angle: Int): Int {
        val result = if(angle < 90){
            return 1
        } else if(angle == 90){
            return 2
        } else if(angle < 180){
            return 3
        } else {
            return 4
        }
    }
}