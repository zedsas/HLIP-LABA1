fun main(args: Array<String>) {
    val fullText = args.joinToString(" ")
    val words = fullText.split(" ")
    val uniqueSortedWords = words.filter { it.isNotEmpty() }.distinct().sorted()
    for (word in uniqueSortedWords) {
        val count = words.count { it == word }
        println("$word $count")
    }
}