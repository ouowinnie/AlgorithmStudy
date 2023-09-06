class Solution {
    fun solution(flo: Double): Int {
        var answer = flo.toString().split(".")[0]
        
        return answer.toInt()
    }
}