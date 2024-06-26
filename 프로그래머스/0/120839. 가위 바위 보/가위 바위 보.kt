class Solution {
    fun solution(rsp: String): String {
       val list = rsp.split("")
        val s = StringBuilder()
        for (i in list) {
            when (i) {
                "2" -> s.append("0")
                "0" -> s.append("5")
                "5" -> s.append("2")
            }
        }

        return s.toString()
    }
}