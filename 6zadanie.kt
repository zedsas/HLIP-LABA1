fun main(args: Array<String>) {
    val fullText = if (args.isEmpty()) readLine() ?: "" else args.joinToString(" ")
    val words = fullText.split(" ")
    val uniqueWords = words.filter { it.isNotEmpty() }.distinct()
    val sortedWords = uniqueWords.sortedWith(
        compareBy<String> { word -> -words.count { it == word } }
            .thenBy { it }
    )
    for (word in sortedWords) {
        val count = words.count { it == word }
        println("$word $count")
    }
}