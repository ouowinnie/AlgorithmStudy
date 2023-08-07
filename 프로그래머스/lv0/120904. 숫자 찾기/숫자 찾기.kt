class Solution {
    fun solution(num: Int, k: Int): Int {
        var numArray = num.toString().map { it.toString().toInt() }.toIntArray()
        var answer = numArray.indexOf(k)
        return if (answer != -1 && numArray[answer] == k) answer +1 else -1
    }
}