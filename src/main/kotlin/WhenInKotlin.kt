fun main(){
    //When is similar like Switch in c/c++/java

    println("Enter day of the week : ")

    val day = readLine()?.toInt()

    when(day){
       1 -> println("Monday")
       2 -> println("Tuesday")
       3 -> println("Wednesday")
       4 -> println("Thursday")
       5 -> println("Friday")
       6 -> println("Saturday")
       7 -> println("Sunday")
    }

//when as a expression assign value to variable
asAexpression()

}

fun asAexpression(){

    println("Please enter first number :")
    val num1 = readLine()?.toInt()

    println("Please enter second number :")
    val num2 = readLine()?.toInt()

    println("Please select ion any operation 1.Addition \n 2. Substraction \n 3. Multiplication \n 4. Division")
    val operation = readLine()?.toInt()

    val output =    when (operation){

        1 -> (num2?.let { num1?.plus(it) })
        2 -> num1?.let { num2?.let { it1 -> num1.minus(it1) } }
        3 -> num1?.let { num2?.times(num1) }
        4 -> num2?.let { num1?.div(num2) }
        else -> {}
    }


    println("Output : $output")
}