fun main(){
    // agak aneh karena biasa di bahasa lain
    // loop itu bisa deklarasi counter baru gitu
    // kotlin ngga bisa...

    // =====LOOPS & LABEL=====

    // for array
    var names: Array<String> = arrayOf("Daffa", "Nabil", "Hakim")
    for (name in names){
        println(name)
    }

    // for range
    for (i in 1..2000){
        print("$i, ")
    }; println()

    // while
    var i = 10
    while (i < 20){
        print("$i, ")
        i++
    }; println()
    // do while
    do {
        print("$i, ")
    } while (i < 10)

    // keyword: break & continue
    // break = out from loop
    // continue = used to skip codes below this keyword (still inside the loop)
    for (i in 0..10){
        if (i == 5) {
            break
        }
        if (i % 2 != 0){
            continue
        }
        println("$i is even")
    }

    // ====== LABEL ======
    // label = penanda
    // Semua expression di Kotlin bisa ditandai dengan label
    // Salah satu kegunaan label adalah, bisa diintegrasikan dengan break, continue dan return
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            println("$i * $j = ${i*j}")
            if (j == 10){
                break@loopI
            }
        }
    }

    // belajar anonymous func/lambda dulu baru liat ini
    testFunc@ fun test(str: String, trans: (str: String)->String) {
        if (str.equals("jokowi", true) || str.equals("puan", true) ){
            println("gawat anda nih")
            return@testFunc // redundant
        }
        println(trans(str))
    }
    test("joKoWi", fun(str: String):String = str.uppercase())


}