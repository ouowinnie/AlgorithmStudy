class Solution {
    fun solution(a: Int, b: Int): Int {
        var abResult = (a.toString() + b.toString()).toInt()
        var baResult = (b.toString() + a.toString()).toInt()
        return if (abResult > baResult) abResult else baResult
    }
}