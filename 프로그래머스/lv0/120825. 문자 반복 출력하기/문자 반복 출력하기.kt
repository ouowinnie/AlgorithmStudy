class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = "" 
        
        for (i in my_string) {
            repeat(n) {
                answer += i
            }
        }
        return answer
    }
}