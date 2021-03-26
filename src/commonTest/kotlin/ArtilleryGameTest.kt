import me.florian.artillerygamelib.Canon
import me.florian.artillerygamelib.GameWorld
import me.florian.artillerygamelib.performPlayerMove
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ArtilleryGameTest {
    @Test
    fun canonHas100Hp() {
        val c = Canon()
        println("Canon location ${c.location}")
        assertEquals(100, c.hitpoints)
    }

    @Test
    fun gameLoop() {
        val g = GameWorld()

        do {
            performPlayerMove(g)
            println(g)
        } while (g.gameContinues())

        assertTrue(g.canon1.hitpoints <= 0 || g.canon2.hitpoints <= 0)
    }

}