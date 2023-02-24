package com.domain.oop

// class by default can't be inherited by other
// so, we use keyword "open" to do that

// 'final' and 'open' can't be used together
open class Employee(val name: String, open val Salary: Double = 1.0) {

    // by default obj's fun/method can't be overridden
    // 'open' makes it so this fun can be overridden
    open fun talk(sentence: String?) {
        if (sentence == null) {
            println("${this.name}: ...")
            return
        }
        println("${this.name}: $sentence")
    }

}

// boss inherits employee class.
// boss = child, employee = parent
final class Boss(name: String, var isFat: Boolean): Employee(name) {
    // we can also override properties :o
    override val Salary: Double = 999999999.0

    // use super to access parent's stuff like properties or functions
    val parentSalary = super.Salary

    // overrides Employee's talk method
    override fun talk(sentence: String?) {
        println("(BOSS) ${this.name}: $sentence")
    }

}


fun main(){
    // boss obj
    val boss = Boss("boSSu", true)
    // child can access child's fun/method
    // but in this example, i already overrided it soo
    boss.talk("HAHAHAHAHHA")

    println("${boss.name}'s salary: ${boss.Salary}")
    println("${boss.name}'s parentSalary: ${boss.parentSalary}")

    // extra:
    // by default all classes INHERITS 'ANY' CLASS
    var emp: Any = Employee("tadano")
    // any has 3 funs
    // 1. equals(Any?), 2. hashCode(): Int, 3. toString(): String
    println(emp.toString())

    // 'is' keyword is to check whether if an object is a type of a class.
    if (emp is Employee) {
        // cast Any obj to Employee
        // 'as' keyword is used to cast obj into another type of Class
        // var temp: Employee = emp as Employee

        // BUT we don't need to cast it like that.
        // Kotlin feature : Smart Casting
        // when we use is to check, the obj will turn into the related class too.
        println(emp.name)
        println(emp.toString())
        // smart casting can be used also in when expression like:
        // when (any) {
        //  is Employee -> //do something
        //  is Boss -> //do something
        // }

        // can't cast carelessly, like below (Exception ClassCastException)
        // var temp2: Boss = emp as Boss
    }

    // with as, we can cast forcefully any data type.
    // but it's dangerous bcz it will return an error if its wrong
    var emp2: Employee = Employee("asd", 23.0)
    // i use try and catch to prevent program from quitting
    try {
        var test =  emp2 as Boss
    } catch (e: Exception) {
        println("error occured!")
    }

    // but we can safely use as with nullable casts
    // example:
    var myNumber: Int = 2
    var myString = myNumber as? String
    println(myString) // null *because Int is not a String.
}