fun main(args: Array<String>) {
    println(getChecksum(getStringListFromFile("src/resources/two_one.in")))
}

private fun getChecksum(inputList: List<String>): Int {
    var numberOfPairs = 0
    var numberOfTriples = 0

    inputList.forEach {
        val charMap: HashMap<Char, Int> = hashMapOf()
        it.asSequence().forEach {
            val lastValue = charMap.put(it, 1)
            if (lastValue != null) charMap[it] = lastValue + 1
        }

        if (containsPairs(charMap)) numberOfPairs++
        if (containsTriples(charMap)) numberOfTriples++
    }
    return numberOfPairs * numberOfTriples
}

private fun containsPairs(charMap: HashMap<Char, Int>) = charMap.values.contains(2)

private fun containsTriples(charMap: HashMap<Char, Int>) = charMap.values.contains(3)