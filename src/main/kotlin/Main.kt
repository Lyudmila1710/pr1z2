fun main() {
    println("Введите строку:")
    val str = readLine().toString()
    val countChar= mutableMapOf<Char, Int>()
    for (char in str) {
        countChar[char] = countChar.getOrDefault(char, 0) + 1
    }
    println{"Вот подсчет различных символов в данной строке в алфавитном порядке:"}
    countChar.toSortedMap().forEach { (char, count) ->
        println("$char - $count")
    }
}