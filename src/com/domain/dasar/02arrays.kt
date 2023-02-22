fun main() {
    var myArr: Array<String> = arrayOf("asd", "asd")
    println("myArr size: ${myArr.size}")
    println("myArr[0]: ${myArr[0]}") // or .get(index)
    // changing arr value
    myArr[0] = "TEST" // or .set(index, value)
    println("myArr[0] value changed to: ${myArr[0]}")

    println("standarnya arrays di kotlin gabole null")
    println("but if we want to, we can using nullable '?' Array<Type?>")
//    var testArr0: Array<String>
//    println("${testArr0}" ) // error must be initialized
    var testArr2: Array<Int?> = arrayOfNulls(5)
    testArr2[1] = 1
    println("testArr2: ${testArr2[0]} ${testArr2[1]}\n")

    println("range")
    val range = 0..200 // step == 1
    println(range.first)
    println(range.step) // 1
    println(range.last)
    println(range.contains(3))
    println(range.count()) // 201

    val range2 = 100 downTo 0 step 5
    println(range2.first)
    println(range2.step) // -5
}