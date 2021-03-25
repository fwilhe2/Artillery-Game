import kotlin.test.*

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
        }while (g.gameContinues())

        assertTrue(g.canon1.hitpoints < 0 || g.canon2.hitpoints < 0)
    }

}