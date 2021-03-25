fun main() {
    val g = GameWorld()

    do {
        performPlayerMove(g)
        println(g)
    }while (g.gameContinues())


    println(g.determineWinner())

}