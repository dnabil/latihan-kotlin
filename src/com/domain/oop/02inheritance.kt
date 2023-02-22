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
    if (emp is Employee) {
        // cast Any obj to Employee
        var temp: Employee = emp as Employee
        println(temp.name)
        println(temp.toString())

        // can't cast carelessly, like below (Exception ClassCastException)
        // var temp2: Boss = emp as Boss
    }
}