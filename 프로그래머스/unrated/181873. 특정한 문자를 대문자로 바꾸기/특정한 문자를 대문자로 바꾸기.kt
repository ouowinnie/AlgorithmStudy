class Solution {
    fun solution(my_string: String, alp: String): String {
        var answer = StringBuilder()
        
        for (char in my_string) {
            if (char.toString() == alp) {
                answer.append(char.uppercaseChar())
            } else {
                answer.append(char)
            }
        }
        
        return answer.toString()
    }
}