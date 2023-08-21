class Solution {
    fun solution(n: Int, k: Int): IntArray {
        val answer = mutableListOf<Int>()
        
        for (i in 1..n) {
            if (i % k == 0) {
                answer.add(i)
            }
        }
        
        return answer.toIntArray()
    }
}