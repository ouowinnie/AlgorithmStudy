class Solution {
    fun solution(my_string: String, alp: String): String {
        var answer: String = ""
        return my_string.replace(alp, alp.uppercase())
    }
}