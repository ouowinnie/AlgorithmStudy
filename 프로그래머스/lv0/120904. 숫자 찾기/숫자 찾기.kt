class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = ("-$num").indexOf(k.toString())
        return answer
    }
}