class Solution {
    fun solution(my_string: String): String {
        var answer: String = my_string.map { it.lowercase() }.sorted().joinToString("")
        return answer
    }
}