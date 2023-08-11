class Solution {
    fun solution(number: Int, n: Int, m: Int): Int {
        var answer: Int = 0
        return if(number % n == 0 && number % m == 0) 1 else 0
    }
}