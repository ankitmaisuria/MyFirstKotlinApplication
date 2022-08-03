//fun main(args : Array<String>){
//    print("I am from Canada.")
//   println("Hello! My name is Ankit.");
//}

fun main(){
   //In kotlin how to declar the variables - Mutable
    var name  = "Ankit Maisuria"
    var x = 20
    var y = 50
    println("My name is : $name")
    println(x+y)

    x = 80
    y = 90
    print(x+y)

    println("-------------------------")

    //How to declare the constant variables

    val a = 50
    val b = 60

    println(b-a)

    //a = 60 compile time error

    // Kotlin recognize the type of the variable. No need to write explicitly

    var lastName : String = "Maisuria"
    println(lastName)

    var c : Int = 60

    println(c)

    val d : Float = 5.5f

    println(d)
}