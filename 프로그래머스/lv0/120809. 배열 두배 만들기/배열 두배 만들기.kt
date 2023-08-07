class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = IntArray(numbers.size)
        
        for (i in 0 until numbers.size) {
            answer[i] = numbers[i] * 2
        }
        return answer
    }
}