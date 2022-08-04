fun main(args : Array<String>){
    // Function Demo
    addition()
    val output = add()
    println("Output : $output")

    addTwoNum(y = 40,x = 50)

    val value = addTwoNumWithReturntype(75,25)
    println("value : $value")

    addUnit()
    factorial(5)
}

fun addition() {
    val x = 10
    val y = 20

    println(x+y)
}

fun add() : Int{
    val x = 100
    val y = 50

    return x+y
}

fun addTwoNum(x : Int, y : Int){
   println(y)
    println(x)
     println(x + y)
}


fun addTwoNumWithReturntype(a: Int, b: Int) :Int{
    return a + b
}

fun addUnit() : Unit{
    val x = 100
    val y = 50
    print(x+y)
}

//Recursive function

fun factorial(a : Int) : Int{
    val result:Int

    if( a <= 1){
        result = a
    }else{
        result = a * factorial(a-1)
    }

    println("Factorial Value : $result")
    return  result
}