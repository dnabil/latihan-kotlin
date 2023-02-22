
//example of const (can be accessed globally)
// must use val, not var
const val APP_NAME = "01hello-kotlin"

fun main() {
    println(APP_NAME)
    println("Hello world!")

    println("NOTE:")
    println("val (values) is  immutable, var(variable) is mutable\n")
    println("the use of val is more preffered")

    //implicit
    var myVar = 4
    println("myVar: $myVar " + myVar::class.simpleName)

    //integers
    println("Integers:")
    var myByte: Byte = 3
    var myShort: Short = 1
    var myInt: Int = 2
    var myLong: Long = 4
    // IDE beri warning karena variable diatas ngga pernah diganti valuenya,
    // jadi disaranin pake val. Ignore aja
    println("$myByte $myShort $myInt $myLong\n")

    //floats
    println("floating point types:")
    var myFloat: Float = 3.3f
    var myDouble: Double = 3.22
    println(myFloat::class.simpleName + ": $myFloat && " + myDouble::class.simpleName + ": $myDouble\n")

    //strings
    var myStr1: String = "asd"
    var myStr2: String = """
        nama saya adalah daffa
        halo ini test myStr2
                
        
    """.trimIndent()
    var myStr3 = """
        |ini line 1,
        |ini line 2(akhir line)
    """.trimMargin()
    var myStr4 = """
        >ini line 1,
        >ini line 2(akhir line)
    """.trimMargin(">")
    println("str1:\n$myStr1")
    println("str2:\n$myStr2")
    println("str3:\n$myStr3")
    println("str4:\n$myStr4")
    println()

    //literals
    println("literals:")
    var decimalLiteral: Int = 3233
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b001
    println("decimalLiteral: $decimalLiteral")
    println("hexadecimalLiteral: $hexadecimalLiteral")
    println("binaryLiteral: $binaryLiteral")

    //*note: underscore membuat angka lebih readable
    // misal utk memisah ribuan, kyk java bisa.

    // conversion pake method to...()
    var myVar2 = 2 // Int
    myShort = myVar2.toShort()
    myByte = myVar2.toByte()
    myLong = myVar2.toLong()
    myFloat = myVar2.toFloat()
    myDouble = myVar2.toDouble()


    // Characters
    var myChar1: Char = 'A'
    var myChar2 = 'B'
    println("myCharacters: $myChar1 $myChar2\n")

    //booleans
    var myBool1: Boolean = true
    var myBool2 = false
    println("booleans: $myBool1 $myBool2\n")

    //string template (pake {})
    println("test string template:")
    println("${myBool1 && myBool2}\n")

//    var str: String = "asda"
//    str = null // error
    // NULLABLE, operator '?'
    println("NULLABLE operator '?'")
    var str: String? = null
    println(str?.length)
    println("pgz said that nullable isn't' recommended to use,")
    println("unless as the last way when accessing java variables.")
    println("because some java variables can be null\n")
}
