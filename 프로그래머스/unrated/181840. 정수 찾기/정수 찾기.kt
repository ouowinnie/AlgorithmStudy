class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        var answer: Int = 0
        
        for(i in 0 until num_list.size) {
            if(n == num_list[i]) {
                answer = 1
                break
            }
        }
        
        return answer
    }
}