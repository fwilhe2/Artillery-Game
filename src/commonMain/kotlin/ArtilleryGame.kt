import kotlin.random.Random

fun performPlayerMove(gameWorld: GameWorld) {

    gameWorld.canon1.hitpoints -= Random.Default.nextInt(5)
    gameWorld.canon2.hitpoints -= Random.Default.nextInt(5)
}

data class Canon(var hitpoints: Int = 100, var location: Int = Random.Default.nextInt(100)) {

}

data class GameWorld(var canon1: Canon = Canon(), var canon2: Canon = Canon()) {
    fun gameContinues() = canon1.hitpoints > 0 && canon2.hitpoints > 0
}