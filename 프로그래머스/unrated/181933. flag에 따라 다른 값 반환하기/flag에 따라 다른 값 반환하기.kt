class Solution {
    fun solution(a: Int, b: Int, flag: Boolean): Int {
        var answer: Int = 0
        return if (flag) a + b else a - b
    }
}