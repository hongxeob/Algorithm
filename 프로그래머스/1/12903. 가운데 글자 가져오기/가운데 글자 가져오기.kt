class Solution {
    fun solution(s: String): String {
    var str = ""
        if(s.length % 2 == 0){
            str = s.get((s.length/2)-1).toString() + s.get(s.length/2).toString()
        }
        else str = s.get(s.length/2).toString()
        return str
    }
}