fun main(args :Array<String>) {
    stringArrayExample()
    primitiveTypeArrayExample()
}

fun primitiveTypeArrayExample(){
    val intArray = arrayOf(1,2,3,4,5,6,7,8,9)
    print(intArray.size)
}

fun stringArrayExample(){
    val strArray = arrayOf("Ankit","Vishal","Rahul","Vinit")
    println(strArray[2])
    strArray[2] = "Maisuria"
    println(strArray[2])
    println(strArray.toString())
    println(strArray.size)
    println(strArray.get(1))
    println(strArray.isArrayOf<String>())
    println(strArray.reversedArray().get(0))
    println(strArray.sortedArrayDescending().get(0))
    System.out.println("----------------------------")

    val strArray2 = arrayOf<String>("canada","India","USA","India")
    val strArray3 = strArray2.reversedArray()
    val strArray4 = strArray2.clone()
    //Loop through an Array
    for (item in strArray2){
        println(item)
    }

    for (item in strArray3){
        println(item)
    }
    println("--------------------------")
    for (item in strArray4){
        println(item)
    }

    //Check element is exsist

    if("canada" in strArray2){
        println("Yes its exsist.")
    }else{
        println("Sorry!")
    }

    val distinctArray = strArray2.distinct()

    for(it in distinctArray){
        println(it)
    }

    val strArray5 = arrayOf<String>()
    println("Is strArray5 empty - ${strArray5.isEmpty()}")
    val intArr = intArrayOf(10)
    intArr[0] = 60
    println(intArr.size)
}

