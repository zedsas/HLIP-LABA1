fun main(args: Array<String>) {
    val fullText = args.joinToString(" ")
    val words = fullText.split(" ")
    val sortedWords = words.sorted()
    for (word in sortedWords) {
        if (word.isNotEmpty()) {
            println(word)
        }
    }
}