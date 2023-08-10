class Solution {
    fun solution(num_str: String): Int {
        var answer: Int = 0
        return num_str.map { it.toString().toInt() }.sum()
    }
}