fun main(args : Array<String>){
    stringDemo()
    intDemo()
    floatDemo()
    charDemo()
    booleanDemo()
    arrayDemo()
    dataTypeConversionDemo()
}

fun stringDemo(){
   // Escaped String demo
    var name = "Hello"
    name = "Good evening"
    println("Example of String demo.")
    println(name)
    println("$name everyone, I hope you got the length of the string ${name.length}")
    val firstname = "Ankit"
    val lastname : String = "Maisuria"
    println("My name is $firstname $lastname. Having showt initials ${firstname.first()}${lastname.first()}")
    println("---------------------------------------")

    // Raw String demo

    var rawString = """Hello How are you
        I am from India.
        Live in Canada.
    """

    println(rawString)

    val str = "Hello It's Me. Ankit Maisuria. I am working as am Application Developer @ Brightorder Inc."
    println("Output - $str")
    println("Output - ${str.length}")
    println("Output - ${str.count()}")
    println("Output - ${str.compareTo("Hello It's Me. Ankit Maisuria. I am working as am Application Developer @ Brightorder Inc. I live in North york Toronto.CA")}")
    println("Output - ${str[6]}")
    println("Output - ${str.plus("Thank you")}")
    println("Output - ${str.drop(5)}")
    println("Output - ${str.dropLast(5)}")
    println("Output - ${str.filter {c: Char -> true  }}")
}

fun intDemo(){
    println("Example of Int demo.")
    var x = 40
    var y = 20
    println("The grater number from $x and $y is ${x>y}")
    var z = x.compareTo(y)
    println(z)
    println("Compare function : ${x.times(y)}")

    val a = 20
    val b:Int = 410
   println(a + b)

    val c : Long = 30000L
    println(c)
}

fun floatDemo(){
    println("Example of fload demo.")
}

fun charDemo(){
    println("Example of Character demo.")
}

fun booleanDemo(){
    println("Example of boolean demo.")

    val b1 = true
    val b2 : Boolean  = false

    val b3 : Boolean ? = null
    println(b1)
    println("Your boolean value : ${!b2}")
    println(b3)
}

fun arrayDemo(){
    val intArray : IntArray = intArrayOf(1,2,3,4,5,6)

    for (value in intArray) {
        print(value)
    }
    println()
    println(intArray[2])
}

fun dataTypeConversionDemo()
{
    val x = 40
    val y : Long = x.toLong()
}