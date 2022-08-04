import java.util.Scanner

fun main(){
    println("Please enter your age :")
    val age = readLine()?.toInt()

    if(age in 1..16){
        println("Kids")
    }else if(age in 17.. 40){
        println("Teen")
    }else if(age in 41..65){
        println("Adult")
    }else{
        println("Elder")
    }

    //Another example with Scanner
    userInput()

    //Function declare as a variable value
    asVariableValue()
}

fun userInput() {

    val scanner = Scanner(System.`in`)

    println("Enter First Number : ")
    val num1 = scanner.nextInt()

    println("Enter Second Number : ")
    val num2 = scanner.nextInt()

    val num = num1 + num2

    println("Output : $num")

    val value = if(num1 > num2) num1 else num2

    println("Value = $value")

}

fun asVariableValue(){

    val x = 45
    val y = 55

    val output = if(x>y){
        println("X is grater number")
        x
    }else{
        println("Y is grater number")
        y
    }

    println("Output : "+output)
}