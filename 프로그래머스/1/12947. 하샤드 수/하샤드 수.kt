class Solution {
    fun solution(x: Int): Boolean {
        var sum = 0
        var tempX = x

        while (tempX != 0) {
            sum += tempX % 10
            tempX /= 10
        }
        return (x % sum == 0)
        
    }
}