fun main(args: Array<String>) {

    /*
    * Logical Operations
    * AND = &&
    * OR = ||
    * NOT = !
    * */

    var fNum = 10
    var sNum = 9
    var tNum = 8

    //AND BOTH MUST BE TRUE
    if ((fNum > sNum) && (tNum < sNum)) {
        println("Yes baby")
    } else {
        println("Ne")
    }

    //OR SEBAGIAN BBOLEH BENAR

    if ((fNum > sNum) || (tNum == sNum)) {
        //TRUE         OR      FALSE
        println("Yes baby")
    } else {
        println("Ne")
    }

}