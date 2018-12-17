fun main(args: Array<String>) {
    println(getFirstDuplicateFrequency(getIntListFromFile("src/resources/one_two.in")))
}

private fun getFirstDuplicateFrequency(inputList: List<Int>): Int {
    var freq = 0

    val listOfFreq: HashMap<Int, Boolean> = hashMapOf()

    while (true) {
        inputList.forEach { freq += it; if (listOfFreq.put(freq, true) != null) return freq }
    }
}