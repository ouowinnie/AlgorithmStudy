class Solution {
    fun solution(start: Int, end: Int): IntArray {
        var answer = ArrayList<Int>()

        for(i in start..end) {
            answer.add(i)
        }
        return answer.toIntArray()
    }
}