fun main(args: Array<String>) {

    println("Enter a number between 1 and 10")
    var enteredNumber = readLine()!!.toInt()

    when (enteredNumber) {
        1 -> println("Wrong Number")
        2 -> println("Getting Close")
        3 -> println("Closer")
        4 -> println("Hmmm....")
        5 -> println("Well, you are lost!")
        6 -> println("Bingo!")
        else -> {
            println("Sorry, you are lost!")
        }
    }


//    var age: Int = 19
//    age = 18
//    when (age) {
//        17 -> println("17")
//        18 -> println("18")
//        19 -> println("Yeah 19")
//        else -> {
//            println("None of the above")
//        }
//    }


}