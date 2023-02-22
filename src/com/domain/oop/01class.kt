package com.domain.oop

/*
    naming convention:
    class name doesn't have to be the same as the file's
    but for readable purpose, just make it the same
*/

//class without constuctor
/*
class User [{}]
 */

// class with PRIMARY constructor
class User(var firstName: String, mNameParam: String?, lNameParam: String?) {
    // User's properties
    var middleName: String? = mNameParam
    var lastName: String? = lNameParam

    // init block runs when constuctor is called
    // used for initialization
    init {
        // do something here...
    }

    // secondary constructors...
    constructor(fNameParam: String):
            this(fNameParam, null, null)
}

//class without PRIMARY constructor
class User2 {
    var firstName: String

    constructor(fNameParam: String) {
        firstName = fNameParam
    }
}

fun main() {
    // obj user
    var user = User("Daffa", "Nabil", "Hakim")

    //using secondary constructor
    user = User("Daffa Nabil Hakim")
    // accessing attribute
    println("hi ${user.firstName}")
    user.firstName = "diganti"
    println("hi ${user.firstName}")

    // properties declared in parameter
    // useful if you want short code
    user = User(firstName = "asda", null, null)

    class Anjing(var name: String)
    {
        // fun inside class -> behaviour of the object
        fun bark(): Unit{
            // this keyword refers to this object
            println("${this.name} barks!")
        }

        // fun overloading
        fun bark(isRoll: Boolean) {
            if (isRoll) {
                println("${this.name} barks and rolling")
            } else {
                println("${this.name} barks and not rolling")
            }
        }
    } // end of class

} // end of main fun