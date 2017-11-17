fun main(args: Array<String>) {
    //Do while loop
    // it at least runs once
    var counter = 0

    do {
        if (counter % 3 == 0) {
            println("FIZZ")
        } else {
            println("BUZZ")
        }

        counter++
    } while (counter < 15)

}