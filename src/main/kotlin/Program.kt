fun main() {

    val a:String ="asjrgapa"

    val x:Int=lengthOfLongestSubstring(a)
    val y:Int =lengthOfLongestSubstring(a.reversed())
    val z: ArrayList<Int> = arrayListOf(x,y)
    println(z.max())

}

var list:ArrayList<Int> = arrayListOf()
fun lengthOfLongestSubstring1(text: String): Int {
    if(text=="") return 0
    var tempText=""
    for (i in 0..text.length-2) {
        tempText += text[i]
        for (j in tempText.indices) {
            if (tempText[j] == text[i+1]) {
                list.add(tempText.length)
                lengthOfLongestSubstring(text.substring(i+1))
                return if(list.isEmpty()) tempText.length+1 else list.max()



            }


        }


    }
    return if(list.isEmpty()) tempText.length+1 else list.max()
}