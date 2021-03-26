import kotlinx.browser.*
import kotlinx.dom.appendText

fun main() {
    val g = GameWorld()

    do {
        performPlayerMove(g)
        println(g)
        document.body!!.appendText(g.toString())
    }while (g.gameContinues())

    println(g.determineWinner())
    document.body!!.appendText(g.determineWinner())
}