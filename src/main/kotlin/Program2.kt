fun main(){}
fun lengthOfLongestSubstring(s: String): Int {
    if (s.isNullOrEmpty()) {
        return 0
    }

    val hSet:HashSet<Char> = HashSet<Char>()
    var max = 0
    var i = 0
    var j = 0

    while (i < s.length) {
        if (!hSet.contains(s[i])) {
            hSet.add(s[i])
            i++
        } else {
            max = maxOf(max, hSet.size)
            hSet.remove(s[j])
            j++
        }
    }
    max = maxOf(max, hSet.size)
    return max
}