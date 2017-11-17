fun main(args: Array<String>) {
    /*
    * The user is prompt with a question
    * The user has to enter and answer
    * If the answer is incorrect then the user is prompted with the answer again
    * else the application terminted
    * */

    var isTrue: Boolean? = false

    do {
        println("How many siblings does Paulo have?")
        var answer: Int? = readLine()!!.toInt()

        when (answer) {
            12 -> {
                println("You are correct!")
                isTrue == true
            }
            else -> {
                println("Incorrect! Try Again! \n")
            }
        }

    } while (isTrue == false)

}