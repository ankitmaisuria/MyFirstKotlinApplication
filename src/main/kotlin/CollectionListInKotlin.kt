fun main(){
    val objList = listOf(10,20,30,40,50)
    println(objList)

    val mutableList = mutableListOf(40,50,60)
    mutableList.add(70)

    println(mutableList)
    //How to iterate the list
    for (value in objList){
        println(value)
    }

    val obj2List = listOf<Char>('a','e','i','o','u')

    println(obj2List)
    println(obj2List.size)
    println(obj2List[2])
    println(obj2List.toString().get(2))
    if (!obj2List.isEmpty()) {
        for (item in obj2List)
        println(item)
        }

    val obj3List = listOf<Int>(100,200,300,400,500)

    if(objList.equals(obj3List)){
        println("Yes")
    }else{
        println("No")
    }

    val templist = objList.plus(obj3List)
    println("Temp list : $templist")

    iteratorFun()
    forloopFun()
    }

fun iteratorFun(){
        val theList = listOf("one", "two", "three", "four")

        val itr = theList.listIterator()
        while (itr.hasNext()) {
            println(itr.next())
        }

}

fun forloopFun(){

        val theList = listOf("one", "two", "three", "four")

        for (i in theList.indices) {
            if (theList[i].equals("three"))
                continue
            println(theList[i])
        }

}

