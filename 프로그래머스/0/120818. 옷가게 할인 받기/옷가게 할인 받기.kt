class Solution {
    fun solution(price: Int): Int {
        when{
            (price >= 500000) -> return (price - (price * 0.2)).toInt()
            (price >= 300000) -> return (price - (price * 0.1)).toInt()
            (price >= 100000) -> return (price - (price * 0.05)).toInt()
            else -> return price
        }
    }
}