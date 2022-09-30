fun main() {
//    println("Enter your name")
//var name = readLine()
//    print(name)

//println("Enter your roll")
//    val roll = readLine()!!.toInt()
//println(roll)
//    println(roll:: class.simpleName)

    val  x = 3
//    when(x){
//        1 -> println("One")
//        2 -> println("two")
//        3 -> println("three")
//        4 -> println("four")
//        else -> println("Not valid")
//    }
//    when(x){
//        1 , 2 -> println("One or two")
//
//        3 -> {
//            println("three")
//        }
//        4 -> println("four")
//        else -> println("Not valid")
//    }

    when(x){
        in 1.. 5-> println("One - 5")


        else -> println("Not valid")
    }
}