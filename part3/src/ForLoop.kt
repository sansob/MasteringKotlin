fun main(args: Array<String>) {
    //For Loop

    for (item in 0..100) {
        if (item % 2 == 0) { //modulo 2
            println("Fizz $item")
        } else if (item % 3 == 0) {
            println("Buzz $item")
        }

    }
}