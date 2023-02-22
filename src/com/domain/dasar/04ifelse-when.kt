fun main() {
    val char = 'A'

    if (char == 'A') {
        println("its A!")
    } else if (char == 'B') {
        println("its B!")
    } else {
        println("hmm")
    }

    // when sama seperti switch dlm bahasa lain
    println("WHEN EXPRESSION")
    when (char) {
        'A', 'B', 'C' -> println("its a/b/c")
        'D' -> println("its D")
        else -> println("idk bro")
    }
    println("check whether variable is char or not")
    when (char) {
        is Char -> println("its char")
        !is Char -> println("its not char")
    }; println()

    println("when with in")
    val myArr: Array<Char> = arrayOf('A', 'a')
    when (char) {
        in myArr -> println("its in!")
        !in myArr -> println("its not in!")
    }

    // note: each case can also use condition, ex: when { myInt < 100 -> println("minimum wage"); etc...}

}