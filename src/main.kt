import java.io.File

fun main(args: Array<String>) {

    val inputFile = File ("src/media/ItemsUSAPrice.txt")
    val outputFile:String = "./media/ItemsToCAPrice.txt"

    var items: List<String> = readInput(inputFile)

    for (i in items) {
        println(i)
    }

    //need to get the second item and change the price

    writeOutput(outputFile, items)
}

fun readInput(inputFile: File): List<String> {

    var items: List<String> = inputFile.readLines()

    return items
}

fun writeOutput(outputFile: String, items: List<String>) {

}