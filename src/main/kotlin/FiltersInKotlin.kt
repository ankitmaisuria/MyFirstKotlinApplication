fun main(){

    val x = 1..10
    val y = x.filter { it-> it % 2 == 0 }

    for (num in y){
        println(num)
    }


    println("-------------------------")

    val strArray = arrayOf("Ankit","Maisuria","India","Canada","Gujarat","India")

    val filterArray  = strArray.filter { it -> it.contains("n") }

    for (str in filterArray){
        println(str)
    }
    println(filterArray.size)
    println("------------------------------")
    listofExample()
}

fun listofExample(){
    val list = listOf<Int>(1,2,3,4,5,6,7,8,9)

    val tempList = list.filter { it->it%2 == 0 }
    println(list)
    println("----------------")
    println(tempList)
}