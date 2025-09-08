fun main(args: Array<String>) {
    val fullText = args.joinToString(" ")
    val words = fullText.split(" ")
    for (word in words) {
        if (word.isNotEmpty()) {
            println(word)
        }
    }
}