fun main(){
    //Kotlin ranges is created using two functions rangeTo() or downTo() or (..)

//    1..10  // Range of integers starting from 1 to 10
//
//    a..z   // Range of characters starting from a to z
//
//    A..Z   // Range of capital characters starting from A to Z
    rangeToExample()
    downToExample()
    println("--------------------------")
    stepExample()
    reversedEample()
}

fun rangeToExample(){

    for(num in 1.rangeTo(5)){
        print("$num ")
    }

    println()
    for(c in 'a'..'z'){
        print("$c ")
    }
}

fun downToExample(){

    for(num in 10.downTo(1)){
        print(num)
        print(" ")
    }
    println()
    for(c in 'z'.downTo('s')){
        print("$c ")
    }

}

fun stepExample(){
    for (num in 1..10 step 3)
        println(num)
}

fun reversedEample(){
    for (num in (1.. 10).reversed())
    {
        println(num)
    }
}