fun main(){
    print("Hello World!\n")
    
    // this is a comment
    /* 
        variables
        print/read
        conditions (if)
        loops
        arrays
        functin
        classes/objects
    */

    // Kotlin has datatype, but defines with var and val
    // var can be reassigned value
    // val is  immutable
    var myInt = 5
    val myChar = '5'
    var myDouble : Double = 3.14

    println(myInt)
    println(myChar)
    println(myDouble)

    var myNewInt = 1
    myNewInt = readln().toInt()
    println("This is my new int: " + myNewInt)
    println("This is my new int: $myNewInt")

    var myBool = true
    if(myBool){
        println("Must be heads")
    }else if (!myBool){
        println("Must be tails")
    }else{
        println("It lands on the sides")
    }

    when(myNewInt%2){
        0 -> {
            println("Even")
        }
        1 -> println("Odd")
        else -> println("Quantum")
    }

    for (i in 0..9){
        println(i)
    }

    for (i in 0..3){
        for (j in 0..4){
            if (j==5){
                break
            }
            println(i.toString() + " / " + j)
        }
    }

    var myCounter = 0
    while(myCounter<10){
        println("My counter: $myCounter")
        ++myCounter
        myCounter++
    }

// there are two ways to go though array, but the second one is more flexible.

    val array = intArrayOf(1,2,3)
    var myList = listOf(8,100,88,11)
    for (item in array){
        // this won't work because item cannot be reassigned
        // item *= 5
        println(item)
    }

    for (index in 0..array.count()-1){
        array[index] *= 5
        println(array[index])
    }
}