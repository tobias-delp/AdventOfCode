import java.io.File

fun getIntListFromFile(filePath: String): List<Int> = File(filePath).useLines { it.map { it.toInt() }.toList() }

fun getStringListFromFile(filePath: String) = File(filePath).useLines { it.toList() }