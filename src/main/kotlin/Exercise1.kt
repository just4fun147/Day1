
fun main(){
//    triangle high
    val rows:Int = 13

//    rectangle side lenght
    val rect:Int = 5

    println("====== Triangle ======")
    for (i in 1..rows) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }

    println("====== Rectangle ======")
    for(i in 1..rect){
        for (j in 1..rect) {
            print("* ")
        }
        println()
    }
}
