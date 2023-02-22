fun main(){
    /*
        TODO: TAILREC belum dipelajari
     */

    greet("Kubo")
    greet("Shiraishi", "night")
    // named argument
    greet(name="Daffa", time="afternoon")


    //vararg parameter
    sum(1,2,3,4,5,6,7,8)

    //extension function
    val sentence = "Kosaki Onodera".confess()
    println(sentence)

    // function dalam function (hanya bisa di akses dalam scope fun main ini.)
    fun blank(name: String): String {
        return """   $name   """
    }
    // infix extension
    println(blank("ichijou raku") case "UP")

    //recursive
    println( factorial(2))
    println( factorial(3))
    println( factorial(4))
    println()

    // lambda
    // val/var variableName: datatype = {parameter: [(opsional) datatype], ... -> function body}
    // secara default baris terakhir merupakan return dari si lambda tersebut
    // jadi gaditulis gappapa
    val sumLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println(sumLambda(5,2))
    // terus ada keyword it! it bisa dipake kalau di lambda cuma ada 1 parameter.
    // contoh penggunaan: ... -> { it.lowercase() } // it itu string misalnya...

    // lambda as parameter
    val myAnonymousFunc = fun(x: String, transformer: (String) -> String){
        println(transformer(x))
    }
    val upperTrans = {value: String -> value.uppercase()}
    myAnonymousFunc("hello", upperTrans)
    // or use anonymous func as argument
    myAnonymousFunc("hello", fun(str: String): String {
        return str.uppercase()
    })

//    DONE!
}

fun greet(name: String?, time: String = "morning") /*:Unit*/ {
    if (name == null) {
        return // returns void (out of this function)
    } else {
        println("hi $name! good $time!")
    }
}

// returns an Int
fun sum(a: Int, b: Int) :Int{
    return a + b
}

// single expression function
fun sum(a: Float, b: Float): Float = a + b

// varargs parameter (gunakan sebagai parameter terakhir)
fun sum(vararg numbers: Int): Int{
    var result: Int = 0
    for(number in numbers){
        result += number
    }
    return result
}

// EXTENSION FUNCTION, mungkin menambahkan function pada data type yang ditentukan kali ya?
fun String.confess() :String {
    return """
        I want to be with you, $this. 
        From now on, I want to spend all and every single 
        one of my days until I die with you, and only you.
    """.trimIndent().replace("\n", "")
}

infix fun String.case(case: String): String{
    if (case.equals("up", true)) {
        println("jer1")
        return this.uppercase()
    } else {
        println("jer2")
        return this.lowercase()
    }
}

// RECURSIVE FUNCTION
fun factorial(num: Long) :Long{
    if (num == 0.toLong()){
        return 1
    }
    return num * factorial(num-1)
}