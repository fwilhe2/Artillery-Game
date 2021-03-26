import me.florian.artillerygamelib.GameWorld
import me.florian.artillerygamelib.performPlayerMove

fun main() {
    val g = GameWorld()
    do {
        performPlayerMove(g)
        println(g)
    }while (g.gameContinues())
    println(g.determineWinner())

}