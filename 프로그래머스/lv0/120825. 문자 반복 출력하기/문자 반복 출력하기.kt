class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        
        for(i in 0 until n) {
            answer += my_string
        }
        return answer.toCharArray().sortedWith(compareBy { my_string.indexOf(it) }).joinToString("")
    }
}